/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.wsman.command.idraccmd;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import com.dell.isg.smi.commons.utilities.xml.XmlHelper;
import com.dell.isg.smi.wsman.WSCommandRNDConstant;
import com.dell.isg.smi.wsman.WSManageSession;

/**
 * @author Muhammad_R
 *
 */
public class IdracGetIntegerEnumerate extends AbstractIdrac {

    private WSManageSession session = null;
    private static final Logger logger = LoggerFactory.getLogger(IdracGetIntegerEnumerate.class);


    /**
     * @param ipAddr
     * @param userName
     * @param passwd
     */
    public IdracGetIntegerEnumerate(String ipAddr, String userName, String passwd) {

        super(ipAddr, userName, passwd);
        if (logger.isTraceEnabled()) {
            logger.trace(String.format("Entering constructor: IdracGetIntegerEnumerate(String ipAddr - %s, String userName - %s, String passwd - %s)", ipAddr, userName, "####"));
        }
        session = super.getSession();
        session.setResourceUri(getResourceURI());
        logger.trace("Exiting constructor: IdracGetIntegerEnumerate()");

    }


    private String getResourceURI() {

        StringBuilder sb = new StringBuilder();
        sb.append(WSCommandRNDConstant.WSMAN_BASE_URI);
        sb.append(WSCommandRNDConstant.WS_OS_SVC_NAMESPACE);
        sb.append("DCIM_iDRACCardInteger");
        return sb.toString();
    }


    @Override
    public List<String> execute() throws Exception {
        logger.trace("Entering function: execute()");
        Document response = this.sendRequestEnumerationReturnDocument();
        String tmp = XmlHelper.convertDocumenttoString(response);
        List<String> stringList = new ArrayList<String>();
        System.out.println("Retuned String: " + tmp.toString());
        logger.trace("Exiting function: execute()");

        return stringList;
    }

}