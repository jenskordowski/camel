/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.redis;

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
public class RedisEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RedisEndpoint target = (RedisEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channels": target.getConfiguration().setChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "command": target.getConfiguration().setCommand(property(camelContext, org.apache.camel.component.redis.Command.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.getConfiguration().setConnectionFactory(property(camelContext, org.springframework.data.redis.connection.RedisConnectionFactory.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "listenercontainer":
        case "listenerContainer": target.getConfiguration().setListenerContainer(property(camelContext, org.springframework.data.redis.listener.RedisMessageListenerContainer.class, value)); return true;
        case "redistemplate":
        case "redisTemplate": target.getConfiguration().setRedisTemplate(property(camelContext, org.springframework.data.redis.core.RedisTemplate.class, value)); return true;
        case "serializer": target.getConfiguration().setSerializer(property(camelContext, org.springframework.data.redis.serializer.RedisSerializer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "channels": return java.lang.String.class;
        case "command": return org.apache.camel.component.redis.Command.class;
        case "connectionfactory":
        case "connectionFactory": return org.springframework.data.redis.connection.RedisConnectionFactory.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "listenercontainer":
        case "listenerContainer": return org.springframework.data.redis.listener.RedisMessageListenerContainer.class;
        case "redistemplate":
        case "redisTemplate": return org.springframework.data.redis.core.RedisTemplate.class;
        case "serializer": return org.springframework.data.redis.serializer.RedisSerializer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RedisEndpoint target = (RedisEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channels": return target.getConfiguration().getChannels();
        case "command": return target.getConfiguration().getCommand();
        case "connectionfactory":
        case "connectionFactory": return target.getConfiguration().getConnectionFactory();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "listenercontainer":
        case "listenerContainer": return target.getConfiguration().getListenerContainer();
        case "redistemplate":
        case "redisTemplate": return target.getConfiguration().getRedisTemplate();
        case "serializer": return target.getConfiguration().getSerializer();
        default: return null;
        }
    }
}

