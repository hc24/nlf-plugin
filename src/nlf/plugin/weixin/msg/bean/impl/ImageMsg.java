﻿package nlf.plugin.weixin.msg.bean.impl;

import nlf.plugin.weixin.msg.bean.AbstractMsg;
import nlf.plugin.weixin.msg.bean.IRequestMsg;
import nlf.plugin.weixin.msg.bean.IResponseMsg;
import nlf.plugin.weixin.msg.type.MsgType;

/**
 * 图片消息
 * 
 * @author 6tail
 * 
 */
public class ImageMsg extends AbstractMsg implements IRequestMsg,IResponseMsg{
  /** 图片URL */
  private String picUrl;
  /** 媒体id */
  private String mediaId;
  /** 消息id */
  private String msgId;

  public ImageMsg(){
    setMsgType(MsgType.image);
  }

  public String getPicUrl(){
    return picUrl;
  }

  public void setPicUrl(String picUrl){
    this.picUrl = picUrl;
  }

  public String getMediaId(){
    return mediaId;
  }

  public void setMediaId(String mediaId){
    this.mediaId = mediaId;
  }

  public String getMsgId(){
    return msgId;
  }

  public void setMsgId(String msgId){
    this.msgId = msgId;
  }
}
