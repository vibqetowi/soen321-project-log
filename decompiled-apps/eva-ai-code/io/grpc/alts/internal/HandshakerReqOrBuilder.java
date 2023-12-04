package io.grpc.alts.internal;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.alts.internal.HandshakerReq;
/* loaded from: classes4.dex */
public interface HandshakerReqOrBuilder extends MessageOrBuilder {
    StartClientHandshakeReq getClientStart();

    StartClientHandshakeReqOrBuilder getClientStartOrBuilder();

    NextHandshakeMessageReq getNext();

    NextHandshakeMessageReqOrBuilder getNextOrBuilder();

    HandshakerReq.ReqOneofCase getReqOneofCase();

    StartServerHandshakeReq getServerStart();

    StartServerHandshakeReqOrBuilder getServerStartOrBuilder();

    boolean hasClientStart();

    boolean hasNext();

    boolean hasServerStart();
}
