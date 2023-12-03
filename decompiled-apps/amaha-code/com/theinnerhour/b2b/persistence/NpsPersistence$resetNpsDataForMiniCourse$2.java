package com.theinnerhour.b2b.persistence;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.NpsCourseTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: NpsPersistence.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "tt", "Lcom/theinnerhour/b2b/model/NpsCourseTrack;", "invoke", "(Lcom/theinnerhour/b2b/model/NpsCourseTrack;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NpsPersistence$resetNpsDataForMiniCourse$2 extends k implements l<NpsCourseTrack, Boolean> {
    final /* synthetic */ String $slug;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NpsPersistence$resetNpsDataForMiniCourse$2(String str) {
        super(1);
        this.$slug = str;
    }

    @Override // ss.l
    public final Boolean invoke(NpsCourseTrack tt2) {
        i.g(tt2, "tt");
        return Boolean.valueOf(i.b(tt2.getSlug(), this.$slug));
    }
}
