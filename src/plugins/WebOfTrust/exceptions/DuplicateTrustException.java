/* This code is part of WoT, a plugin for Freenet. It is distributed 
 * under the GNU General Public License, version 2 (or at your option
 * any later version). See http://www.gnu.org/ for details of the GPL. */
package plugins.WebOfTrust.exceptions;

import plugins.WebOfTrust.Identity;

/**
 * Thrown when there are more than one Trust relationships between 
 * two identities in the database. Should never happen anymore.
 * 
 * @author xor (xor@freenetproject.org)
 * @author Julien Cornuwel (batosai@freenetproject.org)
 */
public class DuplicateTrustException extends RuntimeException {

	private static final long serialVersionUID = -1;

	public DuplicateTrustException(Identity truster, Identity trustee, int amount) {
		super("Duplicate trust from " + truster + "to " + trustee + "; " + amount + " copies exist.");
	}
}
