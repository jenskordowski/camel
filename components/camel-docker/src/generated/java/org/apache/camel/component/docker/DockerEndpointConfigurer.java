/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.docker;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DockerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DockerEndpoint target = (DockerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "certpath":
        case "certPath": target.getConfiguration().setCertPath(property(camelContext, java.lang.String.class, value)); return true;
        case "cmdexecfactory":
        case "cmdExecFactory": target.getConfiguration().setCmdExecFactory(property(camelContext, java.lang.String.class, value)); return true;
        case "email": target.getConfiguration().setEmail(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "followredirectfilter":
        case "followRedirectFilter": target.getConfiguration().setFollowRedirectFilter(property(camelContext, boolean.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loggingfilter":
        case "loggingFilter": target.getConfiguration().setLoggingFilter(property(camelContext, boolean.class, value)); return true;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": target.getConfiguration().setMaxPerRouteConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": target.getConfiguration().setMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "parameters": target.getConfiguration().setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.getConfiguration().setRequestTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "serveraddress":
        case "serverAddress": target.getConfiguration().setServerAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "socket": target.getConfiguration().setSocket(property(camelContext, boolean.class, value)); return true;
        case "tlsverify":
        case "tlsVerify": target.getConfiguration().setTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "certpath":
        case "certPath": return java.lang.String.class;
        case "cmdexecfactory":
        case "cmdExecFactory": return java.lang.String.class;
        case "email": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "followredirectfilter":
        case "followRedirectFilter": return boolean.class;
        case "host": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loggingfilter":
        case "loggingFilter": return boolean.class;
        case "maxperrouteconnections":
        case "maxPerRouteConnections": return java.lang.Integer.class;
        case "maxtotalconnections":
        case "maxTotalConnections": return java.lang.Integer.class;
        case "parameters": return java.util.Map.class;
        case "password": return java.lang.String.class;
        case "port": return java.lang.Integer.class;
        case "requesttimeout":
        case "requestTimeout": return java.lang.Integer.class;
        case "secure": return boolean.class;
        case "serveraddress":
        case "serverAddress": return java.lang.String.class;
        case "socket": return boolean.class;
        case "tlsverify":
        case "tlsVerify": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DockerEndpoint target = (DockerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "certpath":
        case "certPath": return target.getConfiguration().getCertPath();
        case "cmdexecfactory":
        case "cmdExecFactory": return target.getConfiguration().getCmdExecFactory();
        case "email": return target.getConfiguration().getEmail();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "followredirectfilter":
        case "followRedirectFilter": return target.getConfiguration().isFollowRedirectFilter();
        case "host": return target.getConfiguration().getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loggingfilter":
        case "loggingFilter": return target.getConfiguration().isLoggingFilter();
        case "maxperrouteconnections":
        case "maxPerRouteConnections": return target.getConfiguration().getMaxPerRouteConnections();
        case "maxtotalconnections":
        case "maxTotalConnections": return target.getConfiguration().getMaxTotalConnections();
        case "parameters": return target.getConfiguration().getParameters();
        case "password": return target.getConfiguration().getPassword();
        case "port": return target.getConfiguration().getPort();
        case "requesttimeout":
        case "requestTimeout": return target.getConfiguration().getRequestTimeout();
        case "secure": return target.getConfiguration().isSecure();
        case "serveraddress":
        case "serverAddress": return target.getConfiguration().getServerAddress();
        case "socket": return target.getConfiguration().isSocket();
        case "tlsverify":
        case "tlsVerify": return target.getConfiguration().isTlsVerify();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "parameters": return java.lang.Object.class;
        default: return null;
        }
    }
}

