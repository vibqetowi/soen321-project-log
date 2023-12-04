package com.ifriend.data.networking.api.configuration.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatIntroSlidesRemote.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/networking/api/configuration/model/ChatIntroRemote;", "", "slides", "", "Lcom/ifriend/data/networking/api/configuration/model/ChatIntroSlideRemote;", "(Ljava/util/List;)V", "getSlides", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroRemote {
    @SerializedName("slides")
    private final List<ChatIntroSlideRemote> slides;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatIntroRemote copy$default(ChatIntroRemote chatIntroRemote, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatIntroRemote.slides;
        }
        return chatIntroRemote.copy(list);
    }

    public final List<ChatIntroSlideRemote> component1() {
        return this.slides;
    }

    public final ChatIntroRemote copy(List<ChatIntroSlideRemote> slides) {
        Intrinsics.checkNotNullParameter(slides, "slides");
        return new ChatIntroRemote(slides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatIntroRemote) && Intrinsics.areEqual(this.slides, ((ChatIntroRemote) obj).slides);
    }

    public int hashCode() {
        return this.slides.hashCode();
    }

    public String toString() {
        List<ChatIntroSlideRemote> list = this.slides;
        return "ChatIntroRemote(slides=" + list + ")";
    }

    public ChatIntroRemote(List<ChatIntroSlideRemote> slides) {
        Intrinsics.checkNotNullParameter(slides, "slides");
        this.slides = slides;
    }

    public final List<ChatIntroSlideRemote> getSlides() {
        return this.slides;
    }
}
