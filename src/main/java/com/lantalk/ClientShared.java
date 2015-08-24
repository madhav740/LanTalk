package com.lantalk;


import com.lantalk.MultiChatConstants;

//  This is tried to share the applet and stand-alone code
//don't bother about this
public class ClientShared {
    public static final int audioReadBytes = 1024;
    // Leaves 5 bytes for the breaker
    public static final int bytesize = 1024 - MultiChatConstants.BREAKER.length(); //1024//*1024 * 8*/;//6144;//18432;//6144;

    public static final float sampleRate = 8000.0F;
    public static final float frameRate = 8000.0F;

    public static final int sampleSize = 8;

    public ClientShared() {

    }
}
