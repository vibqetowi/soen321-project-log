package io.grpc;
/* loaded from: classes4.dex */
public abstract class ChannelLogger {

    /* loaded from: classes4.dex */
    public enum ChannelLogLevel {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public abstract void log(ChannelLogLevel channelLogLevel, String str);

    public abstract void log(ChannelLogLevel channelLogLevel, String str, Object... objArr);
}
