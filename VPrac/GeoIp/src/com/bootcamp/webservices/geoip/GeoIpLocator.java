/**
 * 
 */
package com.bootcamp.webservices.geoip;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author Boot Camp User 011
 *
 */
public class GeoIpLocator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Enter an Ip address");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIpServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}

	}

}
