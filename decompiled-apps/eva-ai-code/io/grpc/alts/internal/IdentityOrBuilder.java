package io.grpc.alts.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import io.grpc.alts.internal.Identity;
import java.util.Map;
/* loaded from: classes4.dex */
public interface IdentityOrBuilder extends MessageOrBuilder {
    boolean containsAttributes(String str);

    @Deprecated
    Map<String, String> getAttributes();

    int getAttributesCount();

    Map<String, String> getAttributesMap();

    String getAttributesOrDefault(String str, String str2);

    String getAttributesOrThrow(String str);

    String getHostname();

    ByteString getHostnameBytes();

    Identity.IdentityOneofCase getIdentityOneofCase();

    String getServiceAccount();

    ByteString getServiceAccountBytes();
}
