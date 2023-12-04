package io.grpc.lb.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import java.util.List;
/* loaded from: classes4.dex */
public interface ClientStatsOrBuilder extends MessageOrBuilder {
    ClientStatsPerToken getCallsFinishedWithDrop(int i);

    int getCallsFinishedWithDropCount();

    List<ClientStatsPerToken> getCallsFinishedWithDropList();

    ClientStatsPerTokenOrBuilder getCallsFinishedWithDropOrBuilder(int i);

    List<? extends ClientStatsPerTokenOrBuilder> getCallsFinishedWithDropOrBuilderList();

    long getNumCallsFinished();

    long getNumCallsFinishedKnownReceived();

    long getNumCallsFinishedWithClientFailedToSend();

    long getNumCallsStarted();

    Timestamp getTimestamp();

    TimestampOrBuilder getTimestampOrBuilder();

    boolean hasTimestamp();
}
