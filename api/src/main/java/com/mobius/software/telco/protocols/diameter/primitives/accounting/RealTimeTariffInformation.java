package com.mobius.software.telco.protocols.diameter.primitives.accounting;
/*
 * Mobius Software LTD
 * Copyright 2023, Mobius Software LTD and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

import com.mobius.software.telco.protocols.diameter.annotations.DiameterAvpDefinition;
import com.mobius.software.telco.protocols.diameter.primitives.DiameterAvp;
import com.mobius.software.telco.protocols.diameter.primitives.KnownVendorIDs;

/**
*
* @author yulian oifa
*
*/

/*
 * 	7.2.164	Real-Time-Tariff-Information AVP
	The Real-Time-Tariff-Information AVP (AVP code 2305) is of type Grouped and holds the tariff information received in real time according to TS 29.658 [222] in the SIP signalling.
	It has the following ABNF grammar:
	
	< Real-Time-Tariff-Information > :: =  < AVP Header: 2305 >
			 [ Tariff-Information ]
			 [ Tariff-XML ]
 */
@DiameterAvpDefinition(code = 2305L, vendorId = KnownVendorIDs.TGPP_ID, name = "Real-Time-Tariff-Information")
public interface RealTimeTariffInformation extends DiameterAvp
{
	TariffInformation getTariffInformation();
	
	void setTariffInformation(TariffInformation value);
	
	String getTariffXML();
	
	void setTariffXML(String value);
}