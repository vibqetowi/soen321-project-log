package ql;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import ql.d;
/* compiled from: AudioNotificationManager.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioNotificationManager$DescriptionAdapter", f = "AudioNotificationManager.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "resolveUriAsBitmap")
/* loaded from: classes2.dex */
public final class e extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public d.a f29702u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f29703v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ d.a f29704w;

    /* renamed from: x  reason: collision with root package name */
    public int f29705x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d.a aVar, ls.d<? super e> dVar) {
        super(dVar);
        this.f29704w = aVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f29703v = obj;
        this.f29705x |= LinearLayoutManager.INVALID_OFFSET;
        return d.a.f(this.f29704w, null, this);
    }
}
