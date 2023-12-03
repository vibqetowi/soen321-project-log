package hl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.k implements ss.v<String, String, String, Boolean, String, String, Integer, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17676u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s sVar) {
        super(8);
        this.f17676u = sVar;
    }

    @Override // ss.v
    public final Object u(String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        boolean booleanValue2 = bool2.booleanValue();
        s sVar = this.f17676u;
        androidx.activity.result.c<Intent> cVar = sVar.f17729a0;
        Intent intent = new Intent(sVar.requireContext(), LibraryActivity.class);
        Bundle f = defpackage.e.f("operation", "open", "id", str);
        f.putString("itemType", str2);
        f.putString("label", str3);
        f.putBoolean("isFree", booleanValue);
        f.putString("parentId", str4);
        f.putString("parentType", str5);
        f.putString("recentSource", "homescreen");
        f.putInt("itemPositionInList", intValue);
        f.putBoolean("isCompleted", booleanValue2);
        hs.k kVar = hs.k.f19476a;
        cVar.a(intent.putExtras(f));
        return hs.k.f19476a;
    }
}
