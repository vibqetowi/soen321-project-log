package rr;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CustomTemplateActivityFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrr/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class d extends b {

    /* renamed from: u  reason: collision with root package name */
    public boolean f30998u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30999v = new LinkedHashMap();

    public abstract void K();

    public abstract void M();

    public void _$_clearFindViewByIdCache() {
        this.f30999v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f30998u = true;
    }

    public void J() {
    }

    public void O() {
    }
}
