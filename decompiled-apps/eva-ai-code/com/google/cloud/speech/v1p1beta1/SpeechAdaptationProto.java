package com.google.cloud.speech.v1p1beta1;

import com.google.api.AnnotationsProto;
import com.google.api.ClientProto;
import com.google.api.FieldBehaviorProto;
import com.google.api.ResourceProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.EmptyProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldMaskProto;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes7.dex */
public final class SpeechAdaptationProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n;google/cloud/speech/v1p1beta1/cloud_speech_adaptation.proto\u0012\u001dgoogle.cloud.speech.v1p1beta1\u001a\u001cgoogle/api/annotations.proto\u001a\u0017google/api/client.proto\u001a\u001fgoogle/api/field_behavior.proto\u001a\u0019google/api/resource.proto\u001a,google/cloud/speech/v1p1beta1/resource.proto\u001a\u001bgoogle/protobuf/empty.proto\u001a google/protobuf/field_mask.proto\"«\u0001\n\u0016CreatePhraseSetRequest\u00127\n\u0006parent\u0018\u0001 \u0001(\tB'àA\u0002úA!\u0012\u001fspeech.googleapis.com/PhraseSet\u0012\u0015\n\rphrase_set_id\u0018\u0002 \u0001(\t\u0012A\n\nphrase_set\u0018\u0003 \u0001(\u000b2(.google.cloud.speech.v1p1beta1.PhraseSetB\u0003àA\u0002\"\u008c\u0001\n\u0016UpdatePhraseSetRequest\u0012A\n\nphrase_set\u0018\u0001 \u0001(\u000b2(.google.cloud.speech.v1p1beta1.PhraseSetB\u0003àA\u0002\u0012/\n\u000bupdate_mask\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.FieldMask\"L\n\u0013GetPhraseSetRequest\u00125\n\u0004name\u0018\u0001 \u0001(\tB'àA\u0002úA!\n\u001fspeech.googleapis.com/PhraseSet\"v\n\u0014ListPhraseSetRequest\u00127\n\u0006parent\u0018\u0001 \u0001(\tB'àA\u0002úA!\u0012\u001fspeech.googleapis.com/PhraseSet\u0012\u0011\n\tpage_size\u0018\u0002 \u0001(\u0005\u0012\u0012\n\npage_token\u0018\u0003 \u0001(\t\"o\n\u0015ListPhraseSetResponse\u0012=\n\u000bphrase_sets\u0018\u0001 \u0003(\u000b2(.google.cloud.speech.v1p1beta1.PhraseSet\u0012\u0017\n\u000fnext_page_token\u0018\u0002 \u0001(\t\"O\n\u0016DeletePhraseSetRequest\u00125\n\u0004name\u0018\u0001 \u0001(\tB'àA\u0002úA!\n\u001fspeech.googleapis.com/PhraseSet\"µ\u0001\n\u0018CreateCustomClassRequest\u00129\n\u0006parent\u0018\u0001 \u0001(\tB)àA\u0002úA#\u0012!speech.googleapis.com/CustomClass\u0012\u0017\n\u000fcustom_class_id\u0018\u0002 \u0001(\t\u0012E\n\fcustom_class\u0018\u0003 \u0001(\u000b2*.google.cloud.speech.v1p1beta1.CustomClassB\u0003àA\u0002\"\u0092\u0001\n\u0018UpdateCustomClassRequest\u0012E\n\fcustom_class\u0018\u0001 \u0001(\u000b2*.google.cloud.speech.v1p1beta1.CustomClassB\u0003àA\u0002\u0012/\n\u000bupdate_mask\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.FieldMask\"P\n\u0015GetCustomClassRequest\u00127\n\u0004name\u0018\u0001 \u0001(\tB)àA\u0002úA#\n!speech.googleapis.com/CustomClass\"|\n\u0018ListCustomClassesRequest\u00129\n\u0006parent\u0018\u0001 \u0001(\tB)àA\u0002úA#\u0012!speech.googleapis.com/CustomClass\u0012\u0011\n\tpage_size\u0018\u0002 \u0001(\u0005\u0012\u0012\n\npage_token\u0018\u0003 \u0001(\t\"x\n\u0019ListCustomClassesResponse\u0012B\n\u000ecustom_classes\u0018\u0001 \u0003(\u000b2*.google.cloud.speech.v1p1beta1.CustomClass\u0012\u0017\n\u000fnext_page_token\u0018\u0002 \u0001(\t\"S\n\u0018DeleteCustomClassRequest\u00127\n\u0004name\u0018\u0001 \u0001(\tB)àA\u0002úA#\n!speech.googleapis.com/CustomClass2\u009e\u0010\n\nAdaptation\u0012Ö\u0001\n\u000fCreatePhraseSet\u00125.google.cloud.speech.v1p1beta1.CreatePhraseSetRequest\u001a(.google.cloud.speech.v1p1beta1.PhraseSet\"b\u0082Óä\u0093\u0002:\"5/v1p1beta1/{parent=projects/*/locations/*}/phraseSets:\u0001*ÚA\u001fparent,phrase_set,phrase_set_id\u0012²\u0001\n\fGetPhraseSet\u00122.google.cloud.speech.v1p1beta1.GetPhraseSetRequest\u001a(.google.cloud.speech.v1p1beta1.PhraseSet\"D\u0082Óä\u0093\u00027\u00125/v1p1beta1/{name=projects/*/locations/*/phraseSets/*}ÚA\u0004name\u0012Â\u0001\n\rListPhraseSet\u00123.google.cloud.speech.v1p1beta1.ListPhraseSetRequest\u001a4.google.cloud.speech.v1p1beta1.ListPhraseSetResponse\"F\u0082Óä\u0093\u00027\u00125/v1p1beta1/{parent=projects/*/locations/*}/phraseSetsÚA\u0006parent\u0012È\u0001\n\u000fUpdatePhraseSet\u00125.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequest\u001a(.google.cloud.speech.v1p1beta1.PhraseSet\"T\u0082Óä\u0093\u0002N2@/v1p1beta1/{phrase_set.name=projects/*/locations/*/phraseSets/*}:\nphrase_set\u0012¦\u0001\n\u000fDeletePhraseSet\u00125.google.cloud.speech.v1p1beta1.DeletePhraseSetRequest\u001a\u0016.google.protobuf.Empty\"D\u0082Óä\u0093\u00027*5/v1p1beta1/{name=projects/*/locations/*/phraseSets/*}ÚA\u0004name\u0012ã\u0001\n\u0011CreateCustomClass\u00127.google.cloud.speech.v1p1beta1.CreateCustomClassRequest\u001a*.google.cloud.speech.v1p1beta1.CustomClass\"i\u0082Óä\u0093\u0002=\"8/v1p1beta1/{parent=projects/*/locations/*}/customClasses:\u0001*ÚA#parent,custom_class,custom_class_id\u0012»\u0001\n\u000eGetCustomClass\u00124.google.cloud.speech.v1p1beta1.GetCustomClassRequest\u001a*.google.cloud.speech.v1p1beta1.CustomClass\"G\u0082Óä\u0093\u0002:\u00128/v1p1beta1/{name=projects/*/locations/*/customClasses/*}ÚA\u0004name\u0012Ñ\u0001\n\u0011ListCustomClasses\u00127.google.cloud.speech.v1p1beta1.ListCustomClassesRequest\u001a8.google.cloud.speech.v1p1beta1.ListCustomClassesResponse\"I\u0082Óä\u0093\u0002:\u00128/v1p1beta1/{parent=projects/*/locations/*}/customClassesÚA\u0006parent\u0012Õ\u0001\n\u0011UpdateCustomClass\u00127.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest\u001a*.google.cloud.speech.v1p1beta1.CustomClass\"[\u0082Óä\u0093\u0002U2E/v1p1beta1/{custom_class.name=projects/*/locations/*/customClasses/*}:\fcustom_class\u0012\u00ad\u0001\n\u0011DeleteCustomClass\u00127.google.cloud.speech.v1p1beta1.DeleteCustomClassRequest\u001a\u0016.google.protobuf.Empty\"G\u0082Óä\u0093\u0002:*8/v1p1beta1/{name=projects/*/locations/*/customClasses/*}ÚA\u0004name\u001aIÊA\u0015speech.googleapis.comÒA.https://www.googleapis.com/auth/cloud-platformB\u008a\u0001\n!com.google.cloud.speech.v1p1beta1B\u0015SpeechAdaptationProtoP\u0001ZCgoogle.golang.org/genproto/googleapis/cloud/speech/v1p1beta1;speechø\u0001\u0001¢\u0002\u0003GCSb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnnotationsProto.getDescriptor(), ClientProto.getDescriptor(), FieldBehaviorProto.getDescriptor(), ResourceProto.getDescriptor(), SpeechResourceProto.getDescriptor(), EmptyProto.getDescriptor(), FieldMaskProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private SpeechAdaptationProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor = descriptor2;
        internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Parent", "PhraseSetId", "PhraseSet"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor = descriptor3;
        internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"PhraseSet", "UpdateMask"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_descriptor = descriptor4;
        internal_static_google_cloud_speech_v1p1beta1_GetPhraseSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_descriptor = descriptor5;
        internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Parent", "PageSize", "PageToken"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor = descriptor6;
        internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"PhraseSets", "NextPageToken"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_descriptor = descriptor7;
        internal_static_google_cloud_speech_v1p1beta1_DeletePhraseSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Name"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor = descriptor8;
        internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Parent", "CustomClassId", "CustomClass"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor = descriptor9;
        internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"CustomClass", "UpdateMask"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_descriptor = descriptor10;
        internal_static_google_cloud_speech_v1p1beta1_GetCustomClassRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Name"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor = descriptor11;
        internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Parent", "PageSize", "PageToken"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor = descriptor12;
        internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"CustomClasses", "NextPageToken"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_descriptor = descriptor13;
        internal_static_google_cloud_speech_v1p1beta1_DeleteCustomClassRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Name"});
        ExtensionRegistry newInstance = ExtensionRegistry.newInstance();
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.defaultHost);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) FieldBehaviorProto.fieldBehavior);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) AnnotationsProto.http);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.methodSignature);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.oauthScopes);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ResourceProto.resourceReference);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, newInstance);
        AnnotationsProto.getDescriptor();
        ClientProto.getDescriptor();
        FieldBehaviorProto.getDescriptor();
        ResourceProto.getDescriptor();
        SpeechResourceProto.getDescriptor();
        EmptyProto.getDescriptor();
        FieldMaskProto.getDescriptor();
    }
}
