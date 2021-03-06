/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gov.samhsa.acs.dss.wsclient;

import gov.samhsa.acs.dss.ws.contract.DSSPortType;
import gov.samhsa.acs.dss.ws.schema.DSSRequest;
import gov.samhsa.acs.dss.ws.schema.DSSRequestForDirect;
import gov.samhsa.acs.dss.ws.schema.DSSResponse;
import gov.samhsa.acs.dss.ws.schema.DSSResponseForDirect;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.7 2014-05-23T16:02:21.033-04:00
 * Generated source version: 2.7.7
 *
 */

@javax.jws.WebService(serviceName = "DSS", portName = "DSSPort", targetNamespace = "http://acs.samhsa.gov/dss/ws/contract", wsdlLocation = "classpath:DSS.wsdl", endpointInterface = "gov.samhsa.acs.dss.ws.contract.DSSPortType")
public class DSSPortTypeImpl implements DSSPortType {

	private static final Logger LOG = Logger.getLogger(DSSPortTypeImpl.class
			.getName());

	public static DSSRequest expectedValueOfDSSRequest;
	public static DSSResponse returnedValueOfDSSResponse;
	public static DSSRequestForDirect expectedValueOfDSSRequestForDirect;
	public static DSSResponseForDirect returnedValueOfDSSResponseForDirect;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * gov.samhsa.acs.dss.ws.contract.DSSPortType#segmentDocument(gov.samhsa
	 * .acs.dss.ws.schema.DSSRequest parameters )*
	 */
	@Override
	public gov.samhsa.acs.dss.ws.schema.DSSResponse segmentDocument(
			gov.samhsa.acs.dss.ws.schema.DSSRequest parameters) {
		LOG.info("Executing operation segmentDocument");
		System.out.println(parameters);
		try {
			final gov.samhsa.acs.dss.ws.schema.DSSResponse _return = parameters
					.getDocumentXml().equals(
							expectedValueOfDSSRequest.getDocumentXml())
					&& parameters.getEnforcementPoliciesXml().equals(
									expectedValueOfDSSRequest
									.getEnforcementPoliciesXml()) ? returnedValueOfDSSResponse
											: null;
			return _return;
		} catch (final java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	@Override
	public DSSResponseForDirect segmentDocumentForDirect(
			DSSRequestForDirect parameters) {
		final String documentXml = parameters.getDocumentXml();
		final String enforcementPoliciesXml = parameters
				.getEnforcementPoliciesXml();
		final String recipientEmailAddress = parameters
				.getRecipientEmailAddress();
		final String senderEmailAddress = parameters.getSenderEmailAddress();
		final String xdsDocumentEntryUniqueId = parameters
				.getXdsDocumentEntryUniqueId();
		final String documentXml1 = expectedValueOfDSSRequestForDirect
				.getDocumentXml();
		final String enforcementPoliciesXml1 = expectedValueOfDSSRequestForDirect
				.getEnforcementPoliciesXml();
		final String recipientEmailAddress1 = expectedValueOfDSSRequestForDirect
				.getRecipientEmailAddress();
		final String senderEmailAddress1 = expectedValueOfDSSRequestForDirect
				.getSenderEmailAddress();
		final String xdsDocumentEntryUniqueId1 = expectedValueOfDSSRequestForDirect
				.getXdsDocumentEntryUniqueId();

		if (documentXml.equals(documentXml1)
				&& enforcementPoliciesXml.equals(enforcementPoliciesXml1)
				&& recipientEmailAddress.equals(recipientEmailAddress1)
				&& senderEmailAddress.equals(senderEmailAddress1)
				&& xdsDocumentEntryUniqueId.equals(xdsDocumentEntryUniqueId1)) {
			return returnedValueOfDSSResponseForDirect;
		} else {
			throw new RuntimeException();
		}

	}
}
