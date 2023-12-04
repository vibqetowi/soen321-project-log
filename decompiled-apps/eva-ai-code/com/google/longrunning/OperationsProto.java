package com.google.longrunning;

import com.google.api.AnnotationsProto;
import com.google.api.ClientProto;
import com.google.protobuf.AnyProto;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.EmptyProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.rpc.StatusProto;
import org.apache.http.HttpHeaders;
/* loaded from: classes6.dex */
public final class OperationsProto {
    public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
    private static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_google_longrunning_CancelOperationRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_DeleteOperationRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_GetOperationRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_ListOperationsRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_ListOperationsResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_OperationInfo_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_OperationInfo_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_Operation_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_Operation_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_longrunning_WaitOperationRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, OperationInfo> operationInfo;

    private OperationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(operationInfo);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    static {
        GeneratedMessage.GeneratedExtension<DescriptorProtos.MethodOptions, OperationInfo> newFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(OperationInfo.class, OperationInfo.getDefaultInstance());
        operationInfo = newFileScopedGeneratedExtension;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#google/longrunning/operations.proto\u0012\u0012google.longrunning\u001a\u001cgoogle/api/annotations.proto\u001a\u0017google/api/client.proto\u001a\u0019google/protobuf/any.proto\u001a\u001egoogle/protobuf/duration.proto\u001a\u001bgoogle/protobuf/empty.proto\u001a\u0017google/rpc/status.proto\u001a google/protobuf/descriptor.proto\"¨\u0001\n\tOperation\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012&\n\bmetadata\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.Any\u0012\f\n\u0004done\u0018\u0003 \u0001(\b\u0012#\n\u0005error\u0018\u0004 \u0001(\u000b2\u0012.google.rpc.StatusH\u0000\u0012(\n\bresponse\u0018\u0005 \u0001(\u000b2\u0014.google.protobuf.AnyH\u0000B\b\n\u0006result\"#\n\u0013GetOperationRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"\\\n\u0015ListOperationsRequest\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006filter\u0018\u0001 \u0001(\t\u0012\u0011\n\tpage_size\u0018\u0002 \u0001(\u0005\u0012\u0012\n\npage_token\u0018\u0003 \u0001(\t\"d\n\u0016ListOperationsResponse\u00121\n\noperations\u0018\u0001 \u0003(\u000b2\u001d.google.longrunning.Operation\u0012\u0017\n\u000fnext_page_token\u0018\u0002 \u0001(\t\"&\n\u0016CancelOperationRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"&\n\u0016DeleteOperationRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"P\n\u0014WaitOperationRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012*\n\u0007timeout\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration\"=\n\rOperationInfo\u0012\u0015\n\rresponse_type\u0018\u0001 \u0001(\t\u0012\u0015\n\rmetadata_type\u0018\u0002 \u0001(\t2ª\u0005\n\nOperations\u0012\u0094\u0001\n\u000eListOperations\u0012).google.longrunning.ListOperationsRequest\u001a*.google.longrunning.ListOperationsResponse\"+\u0082Óä\u0093\u0002\u0017\u0012\u0015/v1/{name=operations}ÚA\u000bname,filter\u0012\u007f\n\fGetOperation\u0012'.google.longrunning.GetOperationRequest\u001a\u001d.google.longrunning.Operation\"'\u0082Óä\u0093\u0002\u001a\u0012\u0018/v1/{name=operations/**}ÚA\u0004name\u0012~\n\u000fDeleteOperation\u0012*.google.longrunning.DeleteOperationRequest\u001a\u0016.google.protobuf.Empty\"'\u0082Óä\u0093\u0002\u001a*\u0018/v1/{name=operations/**}ÚA\u0004name\u0012\u0088\u0001\n\u000fCancelOperation\u0012*.google.longrunning.CancelOperationRequest\u001a\u0016.google.protobuf.Empty\"1\u0082Óä\u0093\u0002$\"\u001f/v1/{name=operations/**}:cancel:\u0001*ÚA\u0004name\u0012Z\n\rWaitOperation\u0012(.google.longrunning.WaitOperationRequest\u001a\u001d.google.longrunning.Operation\"\u0000\u001a\u001dÊA\u001alongrunning.googleapis.com:Z\n\u000eoperation_info\u0012\u001e.google.protobuf.MethodOptions\u0018\u0099\b \u0001(\u000b2!.google.longrunning.OperationInfoB\u0097\u0001\n\u0016com.google.longrunningB\u000fOperationsProtoP\u0001Z=google.golang.org/genproto/googleapis/longrunning;longrunningø\u0001\u0001ª\u0002\u0012Google.LongRunningÊ\u0002\u0012Google\\LongRunningb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnnotationsProto.getDescriptor(), ClientProto.getDescriptor(), AnyProto.getDescriptor(), DurationProto.getDescriptor(), EmptyProto.getDescriptor(), StatusProto.getDescriptor(), DescriptorProtos.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_longrunning_Operation_descriptor = descriptor2;
        internal_static_google_longrunning_Operation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "Metadata", "Done", "Error", "Response", "Result"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_longrunning_GetOperationRequest_descriptor = descriptor3;
        internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_longrunning_ListOperationsRequest_descriptor = descriptor4;
        internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "Filter", "PageSize", "PageToken"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_longrunning_ListOperationsResponse_descriptor = descriptor5;
        internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Operations", "NextPageToken"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_longrunning_CancelOperationRequest_descriptor = descriptor6;
        internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_longrunning_DeleteOperationRequest_descriptor = descriptor7;
        internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Name"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_longrunning_WaitOperationRequest_descriptor = descriptor8;
        internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Name", HttpHeaders.TIMEOUT});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_longrunning_OperationInfo_descriptor = descriptor9;
        internal_static_google_longrunning_OperationInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ResponseType", "MetadataType"});
        newFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        ExtensionRegistry newInstance = ExtensionRegistry.newInstance();
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.defaultHost);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) AnnotationsProto.http);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.methodSignature);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, newInstance);
        AnnotationsProto.getDescriptor();
        ClientProto.getDescriptor();
        AnyProto.getDescriptor();
        DurationProto.getDescriptor();
        EmptyProto.getDescriptor();
        StatusProto.getDescriptor();
        DescriptorProtos.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
}
