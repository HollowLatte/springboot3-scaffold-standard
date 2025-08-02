#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 适配器层。负责处理所有与外部系统的交互，例如 Web Controller、消息队列的消费者等。它的作用是将外部请求“适配”成内部的 Command 或 Query。
 */
package ${package}.adapter.rpc;