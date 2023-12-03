package db;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f12720b;

    /* compiled from: BottomAppBar.java */
    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f12720b;
            int i6 = BottomAppBar.D0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i6) {
        this.f12720b = bottomAppBar;
        this.f12719a = i6;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f12720b.y(this.f12719a));
        floatingActionButton.m(new a(), true);
    }
}
