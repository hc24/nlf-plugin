package nlf.plugin.weibo.msg.bean.impl;

import nlf.plugin.weibo.msg.bean.AbstractEventMsg;
import nlf.plugin.weibo.msg.type.EventType;

/**
 * 微博用户取消关注事件
 * 
 * @author 6tail
 *
 */
public class UnFollowEventMsg extends AbstractEventMsg{
  public UnFollowEventMsg(){
    setEventType(EventType.unfollow);
  }
}