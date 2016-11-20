package ldaptest;

import java.io.IOException;
import java.security.Security;
import java.util.Enumeration;

import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPException;
import com.novell.ldap.LDAPJSSESecureSocketFactory;
import com.novell.ldap.LDAPSearchResults;
import com.novell.ldap.LDAPSocketFactory;
import com.novell.ldap.util.Base64;

public class RetrieveGroupName {

	public static void main(String[] args) throws LDAPException {

		/*Establish a secured connection*/
		int ldapPort = LDAPConnection.DEFAULT_SSL_PORT;
		int ldapVersion = LDAPConnection.LDAP_V3;
		String ldapHost = args[0];
		String loginDN = args[1];
		String password = args[2];
		String path = "C:/test/ssl.keystore";
		LDAPSocketFactory ssf;

		try{
			// Dynamically set JSSE as a security provider
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			// Dynamically set the property that JSSE uses to identify
			// the keystore that holds trusted root certificates
			System.setProperty("javax.net.ssl.trustStore", path);
			ssf = new LDAPJSSESecureSocketFactory();
			// Set the socket factory as the default for all future connections
			LDAPConnection.setSocketFactory(ssf);
			LDAPConnection lc = new LDAPConnection();
			// connect to the server
			lc.connect( ldapHost, ldapPort );
			// authenticate to the server
			lc.bind( ldapVersion, loginDN, password.getBytes("UTF8") );
			// at this point you are connected with a secure connection
			System.out.println( "Successful SSL bind with server.");


			/*Do your stuffs*/

			int searchScope = LDAPConnection.SUBTREE_SCOPE;

			String searchFilter = "(&(objectClass=user))";


			LDAPSearchResults searchResults =
					lc.search(  searchBase,
							searchScope,
							searchFilter,
							null,         // return all attributes
									false);       // return attrs and values
			/* To print out the search results,

			 *   -- The first while loop goes through all the entries

			 *   -- The second while loop goes through all the attributes

			 *   -- The third while loop goes through all the attribute values

			 */

			while ( searchResults.hasMore()) {
				LDAPEntry nextEntry = null;
				try {
					nextEntry = searchResults.next();
				}
				catch(LDAPException e) {
					System.out.println("Error: " + e.toString());
					// Exception is thrown, go for next entry
					if(e.getResultCode() == LDAPException.LDAP_TIMEOUT ||
							e.getResultCode() == LDAPException.CONNECT_ERROR)
						break;
					else
						continue;
				}
				System.out.println("\n" + nextEntry.getDN());
				System.out.println("  Attributes: ");
				LDAPAttributeSet attributeSet = nextEntry.getAttributeSet();
				Iterator allAttributes = attributeSet.iterator();

				while(allAttributes.hasNext()) {
					LDAPAttribute attribute =
							(LDAPAttribute)allAttributes.next();
					String attributeName = attribute.getName();
					System.out.println("    " + attributeName);
					Enumeration allValues = attribute.getStringValues();
					if( allValues != null) {

						while(allValues.hasMoreElements()) {
							String Value = (String) allValues.nextElement();
							if (Base64.isLDIFSafe(Value)) {
								// is printable
								System.out.println("      " + Value);
							}
							else {

								// base64 encode and then print out
								Value = Base64.encode(Value.getBytes());
								System.out.println("      " + Value);
							}
						}
					}
				}
			}
			lc.disconnect();
		}catch (IOException e){

		}
	}
}
