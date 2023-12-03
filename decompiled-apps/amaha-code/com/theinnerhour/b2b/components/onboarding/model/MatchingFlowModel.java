package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: MatchingFlowModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jy\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/MatchingFlowModel;", "", "difficulty", "", "duration", "expertise", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "languages", "needImmediately", "", "userAge", "limit", "", "requestFrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;ILjava/lang/String;)V", "getDifficulty", "()Ljava/lang/String;", "getDuration", "getExpertise", "()Ljava/util/ArrayList;", "getLanguages", "getLimit", "()I", "getNeedImmediately", "()Z", "getRequestFrom", "getUserAge", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MatchingFlowModel {
    @b("difficulty")
    private final String difficulty;
    @b("duration")
    private final String duration;
    @b("expertise")
    private final ArrayList<String> expertise;
    @b("languages")
    private final ArrayList<String> languages;
    @b("limit")
    private final int limit;
    @b("need_immediately")
    private final boolean needImmediately;
    @b("request_from")
    private final String requestFrom;
    @b("user_age")
    private final String userAge;

    public MatchingFlowModel(String difficulty, String duration, ArrayList<String> expertise, ArrayList<String> languages, boolean z10, String userAge, int i6, String requestFrom) {
        i.g(difficulty, "difficulty");
        i.g(duration, "duration");
        i.g(expertise, "expertise");
        i.g(languages, "languages");
        i.g(userAge, "userAge");
        i.g(requestFrom, "requestFrom");
        this.difficulty = difficulty;
        this.duration = duration;
        this.expertise = expertise;
        this.languages = languages;
        this.needImmediately = z10;
        this.userAge = userAge;
        this.limit = i6;
        this.requestFrom = requestFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchingFlowModel copy$default(MatchingFlowModel matchingFlowModel, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str3, int i6, String str4, int i10, Object obj) {
        String str5;
        String str6;
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        boolean z11;
        String str7;
        int i11;
        String str8;
        if ((i10 & 1) != 0) {
            str5 = matchingFlowModel.difficulty;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = matchingFlowModel.duration;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            arrayList3 = matchingFlowModel.expertise;
        } else {
            arrayList3 = arrayList;
        }
        if ((i10 & 8) != 0) {
            arrayList4 = matchingFlowModel.languages;
        } else {
            arrayList4 = arrayList2;
        }
        if ((i10 & 16) != 0) {
            z11 = matchingFlowModel.needImmediately;
        } else {
            z11 = z10;
        }
        if ((i10 & 32) != 0) {
            str7 = matchingFlowModel.userAge;
        } else {
            str7 = str3;
        }
        if ((i10 & 64) != 0) {
            i11 = matchingFlowModel.limit;
        } else {
            i11 = i6;
        }
        if ((i10 & 128) != 0) {
            str8 = matchingFlowModel.requestFrom;
        } else {
            str8 = str4;
        }
        return matchingFlowModel.copy(str5, str6, arrayList3, arrayList4, z11, str7, i11, str8);
    }

    public final String component1() {
        return this.difficulty;
    }

    public final String component2() {
        return this.duration;
    }

    public final ArrayList<String> component3() {
        return this.expertise;
    }

    public final ArrayList<String> component4() {
        return this.languages;
    }

    public final boolean component5() {
        return this.needImmediately;
    }

    public final String component6() {
        return this.userAge;
    }

    public final int component7() {
        return this.limit;
    }

    public final String component8() {
        return this.requestFrom;
    }

    public final MatchingFlowModel copy(String difficulty, String duration, ArrayList<String> expertise, ArrayList<String> languages, boolean z10, String userAge, int i6, String requestFrom) {
        i.g(difficulty, "difficulty");
        i.g(duration, "duration");
        i.g(expertise, "expertise");
        i.g(languages, "languages");
        i.g(userAge, "userAge");
        i.g(requestFrom, "requestFrom");
        return new MatchingFlowModel(difficulty, duration, expertise, languages, z10, userAge, i6, requestFrom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchingFlowModel)) {
            return false;
        }
        MatchingFlowModel matchingFlowModel = (MatchingFlowModel) obj;
        if (i.b(this.difficulty, matchingFlowModel.difficulty) && i.b(this.duration, matchingFlowModel.duration) && i.b(this.expertise, matchingFlowModel.expertise) && i.b(this.languages, matchingFlowModel.languages) && this.needImmediately == matchingFlowModel.needImmediately && i.b(this.userAge, matchingFlowModel.userAge) && this.limit == matchingFlowModel.limit && i.b(this.requestFrom, matchingFlowModel.requestFrom)) {
            return true;
        }
        return false;
    }

    public final String getDifficulty() {
        return this.difficulty;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ArrayList<String> getExpertise() {
        return this.expertise;
    }

    public final ArrayList<String> getLanguages() {
        return this.languages;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final boolean getNeedImmediately() {
        return this.needImmediately;
    }

    public final String getRequestFrom() {
        return this.requestFrom;
    }

    public final String getUserAge() {
        return this.userAge;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int j10 = c.j(this.languages, c.j(this.expertise, a.c(this.duration, this.difficulty.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.needImmediately;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        String str = this.userAge;
        return this.requestFrom.hashCode() + ((a.c(str, (j10 + i6) * 31, 31) + this.limit) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MatchingFlowModel(difficulty=");
        sb2.append(this.difficulty);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", expertise=");
        sb2.append(this.expertise);
        sb2.append(", languages=");
        sb2.append(this.languages);
        sb2.append(", needImmediately=");
        sb2.append(this.needImmediately);
        sb2.append(", userAge=");
        sb2.append(this.userAge);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", requestFrom=");
        return g.c(sb2, this.requestFrom, ')');
    }
}
