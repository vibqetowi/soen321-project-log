package com.google.api;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
/* loaded from: classes7.dex */
public final class LaunchStageProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dgoogle/api/launch_stage.proto\u0012\ngoogle.api*\u008c\u0001\n\u000bLaunchStage\u0012\u001c\n\u0018LAUNCH_STAGE_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rUNIMPLEMENTED\u0010\u0006\u0012\r\n\tPRELAUNCH\u0010\u0007\u0012\u0010\n\fEARLY_ACCESS\u0010\u0001\u0012\t\n\u0005ALPHA\u0010\u0002\u0012\b\n\u0004BETA\u0010\u0003\u0012\u0006\n\u0002GA\u0010\u0004\u0012\u000e\n\nDEPRECATED\u0010\u0005BZ\n\u000ecom.google.apiB\u0010LaunchStageProtoP\u0001Z-google.golang.org/genproto/googleapis/api;api¢\u0002\u0004GAPIb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LaunchStageProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
