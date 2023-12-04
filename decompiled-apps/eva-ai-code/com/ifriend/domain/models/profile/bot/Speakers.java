package com.ifriend.domain.models.profile.bot;

import com.ifriend.chat.presentation.ui.onboarding.analytics.OnboardingAnalyticsImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotVoiceConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Speakers;", "", OnboardingAnalyticsImpl.GENDER_FEMALE, "", "Lcom/ifriend/domain/models/profile/bot/BotVoice;", OnboardingAnalyticsImpl.GENDER_MALE, "(Ljava/util/List;Ljava/util/List;)V", "getFem", "()Ljava/util/List;", "getMal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Speakers {
    private final List<BotVoice> fem;
    private final List<BotVoice> mal;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Speakers copy$default(Speakers speakers, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = speakers.fem;
        }
        if ((i & 2) != 0) {
            list2 = speakers.mal;
        }
        return speakers.copy(list, list2);
    }

    public final List<BotVoice> component1() {
        return this.fem;
    }

    public final List<BotVoice> component2() {
        return this.mal;
    }

    public final Speakers copy(List<BotVoice> fem, List<BotVoice> mal) {
        Intrinsics.checkNotNullParameter(fem, "fem");
        Intrinsics.checkNotNullParameter(mal, "mal");
        return new Speakers(fem, mal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Speakers) {
            Speakers speakers = (Speakers) obj;
            return Intrinsics.areEqual(this.fem, speakers.fem) && Intrinsics.areEqual(this.mal, speakers.mal);
        }
        return false;
    }

    public int hashCode() {
        return (this.fem.hashCode() * 31) + this.mal.hashCode();
    }

    public String toString() {
        List<BotVoice> list = this.fem;
        List<BotVoice> list2 = this.mal;
        return "Speakers(fem=" + list + ", mal=" + list2 + ")";
    }

    public Speakers(List<BotVoice> fem, List<BotVoice> mal) {
        Intrinsics.checkNotNullParameter(fem, "fem");
        Intrinsics.checkNotNullParameter(mal, "mal");
        this.fem = fem;
        this.mal = mal;
    }

    public final List<BotVoice> getFem() {
        return this.fem;
    }

    public final List<BotVoice> getMal() {
        return this.mal;
    }
}
