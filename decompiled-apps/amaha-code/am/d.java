package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.q<Date, Integer, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f637u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(3);
        this.f637u = firestoreGoalsActivity;
    }

    @Override // ss.q
    public final hs.k invoke(Date date, Integer num, Boolean bool) {
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        Date date2 = date;
        num.intValue();
        bool.booleanValue();
        kotlin.jvm.internal.i.g(date2, "date");
        FirestoreGoalsActivity firestoreGoalsActivity = this.f637u;
        fm.a aVar = firestoreGoalsActivity.f11151x;
        if (aVar != null) {
            aVar.D = date2;
        }
        if (aVar != null) {
            aVar.p();
        }
        try {
            ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(date2.getTime()));
            yp.b bVar = firestoreGoalsActivity.f11150w;
            if (bVar != null && (robertoTextView2 = bVar.f38726s) != null) {
                Extensions.INSTANCE.visible(robertoTextView2);
            }
            yp.b bVar2 = firestoreGoalsActivity.f11150w;
            if (bVar2 != null) {
                robertoTextView = bVar2.f38726s;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setText(LocalDateTime.ofEpochSecond(date2.getTime() / 1000, 0, offset).format(DateTimeFormatter.ofPattern("MMMM yyyy").withLocale(Locale.ENGLISH)));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(firestoreGoalsActivity.f11149v, e10);
        }
        return hs.k.f19476a;
    }
}
