package com.ifriend.ui.recyclerView.audio.audioView.messageText;

import com.ifriend.ui.recyclerView.audio.audioView.rewindView.RewindResources;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
/* compiled from: SampleAudioMessageText.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n¨\u0006 "}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText;", "", "text", "", "id", "isExpanded", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "generateFromTextPredicate", "getId", "()Ljava/lang/String;", "imageId", "", "getImageId", "()I", "()Z", "messageLengthType", "Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "getMessageLengthType", "()Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "messageLengthType$delegate", "Lkotlin/Lazy;", "getText", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "MessageLengthType", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SampleAudioMessageText {
    public static final int $stable = 8;
    private final boolean generateFromTextPredicate;
    private final String id;
    private final boolean isExpanded;
    private final Lazy messageLengthType$delegate;
    private final String text;

    public static /* synthetic */ SampleAudioMessageText copy$default(SampleAudioMessageText sampleAudioMessageText, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sampleAudioMessageText.text;
        }
        if ((i & 2) != 0) {
            str2 = sampleAudioMessageText.id;
        }
        if ((i & 4) != 0) {
            z = sampleAudioMessageText.isExpanded;
        }
        return sampleAudioMessageText.copy(str, str2, z);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.id;
    }

    public final boolean component3() {
        return this.isExpanded;
    }

    public final SampleAudioMessageText copy(String text, String id, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id, "id");
        return new SampleAudioMessageText(text, id, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SampleAudioMessageText) {
            SampleAudioMessageText sampleAudioMessageText = (SampleAudioMessageText) obj;
            return Intrinsics.areEqual(this.text, sampleAudioMessageText.text) && Intrinsics.areEqual(this.id, sampleAudioMessageText.id) && this.isExpanded == sampleAudioMessageText.isExpanded;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.text.hashCode() * 31) + this.id.hashCode()) * 31;
        boolean z = this.isExpanded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.text;
        String str2 = this.id;
        boolean z = this.isExpanded;
        return "SampleAudioMessageText(text=" + str + ", id=" + str2 + ", isExpanded=" + z + ")";
    }

    public SampleAudioMessageText(String text, String id, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id, "id");
        this.text = text;
        this.id = id;
        this.isExpanded = z;
        this.messageLengthType$delegate = LazyKt.lazy(new SampleAudioMessageText$messageLengthType$2(this));
        this.generateFromTextPredicate = text.length() > 0;
    }

    public final String getText() {
        return this.text;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final MessageLengthType getMessageLengthType() {
        return (MessageLengthType) this.messageLengthType$delegate.getValue();
    }

    public final int getImageId() {
        Object obj;
        Iterator it = SequencesKt.sequenceOf(this.text, this.id).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            boolean z = true;
            if (!(str.length() > 0) || Intrinsics.areEqual(str, "Sent you an audio")) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str2 = (String) obj;
        return (str2 != null ? Math.abs(str2.hashCode()) : 0) % RewindResources.INSTANCE.getResourcesSize(getMessageLengthType());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SampleAudioMessageText.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "", "lengthLimitExcluded", "", "(Ljava/lang/String;II)V", "SMALL", "MEDIUM", "LARGE", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MessageLengthType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MessageLengthType[] $VALUES;
        public static final Companion Companion;
        private final int lengthLimitExcluded;
        public static final MessageLengthType SMALL = new MessageLengthType("SMALL", 0, 12);
        public static final MessageLengthType MEDIUM = new MessageLengthType("MEDIUM", 1, 36);
        public static final MessageLengthType LARGE = new MessageLengthType("LARGE", 2, Integer.MAX_VALUE);

        private static final /* synthetic */ MessageLengthType[] $values() {
            return new MessageLengthType[]{SMALL, MEDIUM, LARGE};
        }

        public static EnumEntries<MessageLengthType> getEntries() {
            return $ENTRIES;
        }

        public static MessageLengthType valueOf(String str) {
            return (MessageLengthType) Enum.valueOf(MessageLengthType.class, str);
        }

        public static MessageLengthType[] values() {
            return (MessageLengthType[]) $VALUES.clone();
        }

        private MessageLengthType(String str, int i, int i2) {
            this.lengthLimitExcluded = i2;
        }

        static {
            MessageLengthType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new Companion(null);
        }

        /* compiled from: SampleAudioMessageText.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType$Companion;", "", "()V", "get", "Lcom/ifriend/ui/recyclerView/audio/audioView/messageText/SampleAudioMessageText$MessageLengthType;", "textLength", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final MessageLengthType get(int i) {
                return i < MessageLengthType.SMALL.lengthLimitExcluded ? MessageLengthType.SMALL : i < MessageLengthType.MEDIUM.lengthLimitExcluded ? MessageLengthType.MEDIUM : MessageLengthType.LARGE;
            }
        }
    }
}
