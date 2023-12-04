package com.google.cloud.speech.v1p1beta1;

import com.google.api.AnnotationsProto;
import com.google.api.ResourceProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
/* loaded from: classes7.dex */
public final class SpeechResourceProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n,google/cloud/speech/v1p1beta1/resource.proto\u0012\u001dgoogle.cloud.speech.v1p1beta1\u001a\u0019google/api/resource.proto\u001a\u001cgoogle/api/annotations.proto\"\u0083\u0002\n\u000bCustomClass\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fcustom_class_id\u0018\u0002 \u0001(\t\u0012C\n\u0005items\u0018\u0003 \u0003(\u000b24.google.cloud.speech.v1p1beta1.CustomClass.ClassItem\u001a\u001a\n\tClassItem\u0012\r\n\u0005value\u0018\u0001 \u0001(\t:lêAi\n!speech.googleapis.com/CustomClass\u0012Dprojects/{project}/locations/{location}/customClasses/{custom_class}\"ù\u0001\n\tPhraseSet\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012@\n\u0007phrases\u0018\u0002 \u0003(\u000b2/.google.cloud.speech.v1p1beta1.PhraseSet.Phrase\u0012\r\n\u0005boost\u0018\u0004 \u0001(\u0002\u001a&\n\u0006Phrase\u0012\r\n\u0005value\u0018\u0001 \u0001(\t\u0012\r\n\u0005boost\u0018\u0002 \u0001(\u0002:eêAb\n\u001fspeech.googleapis.com/PhraseSet\u0012?projects/{project}/locations/{location}/phraseSets/{phrase_set}\"´\u0001\n\u0010SpeechAdaptation\u0012=\n\u000bphrase_sets\u0018\u0001 \u0003(\u000b2(.google.cloud.speech.v1p1beta1.PhraseSet\u0012\u001d\n\u0015phrase_set_references\u0018\u0002 \u0003(\t\u0012B\n\u000ecustom_classes\u0018\u0003 \u0003(\u000b2*.google.cloud.speech.v1p1beta1.CustomClassB\u0088\u0001\n!com.google.cloud.speech.v1p1beta1B\u0013SpeechResourceProtoP\u0001ZCgoogle.golang.org/genproto/googleapis/cloud/speech/v1p1beta1;speechø\u0001\u0001¢\u0002\u0003GCSb\u0006proto3"}, new Descriptors.FileDescriptor[]{ResourceProto.getDescriptor(), AnnotationsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_CustomClass_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_CustomClass_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_PhraseSet_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_PhraseSet_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private SpeechResourceProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_cloud_speech_v1p1beta1_CustomClass_descriptor = descriptor2;
        internal_static_google_cloud_speech_v1p1beta1_CustomClass_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Name", "CustomClassId", "Items"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_descriptor = descriptor3;
        internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Value"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_cloud_speech_v1p1beta1_PhraseSet_descriptor = descriptor4;
        internal_static_google_cloud_speech_v1p1beta1_PhraseSet_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Name", "Phrases", "Boost"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_descriptor = descriptor5;
        internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Value", "Boost"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_descriptor = descriptor6;
        internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"PhraseSets", "PhraseSetReferences", "CustomClasses"});
        ExtensionRegistry newInstance = ExtensionRegistry.newInstance();
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ResourceProto.resource);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, newInstance);
        ResourceProto.getDescriptor();
        AnnotationsProto.getDescriptor();
    }
}
