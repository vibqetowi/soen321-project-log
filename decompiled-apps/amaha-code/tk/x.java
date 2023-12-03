package tk;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Locale;
/* compiled from: CommunityEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.k implements ss.p<vk.b, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f33223u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f33224v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f33225w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Dialog f33226x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.u uVar, c cVar, View view, Dialog dialog) {
        super(2);
        this.f33223u = uVar;
        this.f33224v = cVar;
        this.f33225w = view;
        this.f33226x = dialog;
    }

    @Override // ss.p
    public final hs.k invoke(vk.b bVar, Integer num) {
        String str;
        boolean z10;
        vk.b community = bVar;
        num.intValue();
        kotlin.jvm.internal.i.g(community, "community");
        this.f33223u.f23466u = true;
        String valueOf = String.valueOf(community.b());
        c cVar = this.f33224v;
        cVar.f33176z = valueOf;
        cVar.A = String.valueOf(community.c());
        String str2 = gk.a.f16573a;
        Bundle f = defpackage.e.f("variant", "variant_d", "experiment", "comm_acquisition");
        User f2 = defpackage.b.f(f, "platform", "android_app");
        String str3 = null;
        if (f2 != null) {
            str = f2.getCurrentCourseName();
        } else {
            str = null;
        }
        User f10 = defpackage.b.f(f, "domain", str);
        if (f10 != null) {
            str3 = f10.getCurrentCourseName();
        }
        f.putString("course", str3);
        f.putString("channel_name", cVar.f33176z);
        f.putBoolean("group_joined", !cVar.D.isEmpty());
        Boolean bool = cVar.C;
        if (bool != null) {
            f.putBoolean("onboarding_completed", bool.booleanValue());
        }
        hs.k kVar = hs.k.f19476a;
        gk.a.b(f, "comm_db_channel_modal_select");
        View view = this.f33225w;
        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvCardV4DomainName);
        String valueOf2 = String.valueOf(community.b());
        if (valueOf2.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            String valueOf3 = String.valueOf(valueOf2.charAt(0));
            kotlin.jvm.internal.i.e(valueOf3, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf3.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb2.append((Object) upperCase);
            String substring = valueOf2.substring(1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            valueOf2 = sb2.toString();
        }
        robertoTextView.setText(valueOf2);
        com.bumptech.glide.e<Bitmap> a10 = Glide.g(cVar.requireContext()).a();
        a10.Z = community.a();
        a10.f5953b0 = true;
        a10.B((AppCompatImageView) view.findViewById(R.id.ivCardV4DomainImage));
        this.f33226x.dismiss();
        return hs.k.f19476a;
    }
}
