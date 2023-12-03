package kk;

import android.app.Application;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import ap.f;
import ap.h;
import cn.e1;
import cn.w;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.model.Course;
import fm.a1;
import fm.j0;
import fm.j1;
import fm.t1;
import wo.e0;
import wo.n0;
/* compiled from: ActivityFetchingViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class c extends o0.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23380b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f23381c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f23382d;

    public c(Application application, f fVar) {
        this.f23380b = 8;
        this.f23381c = fVar;
        this.f23382d = application;
    }

    @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
    public final l0 a(Class cls) {
        int i6 = this.f23380b;
        Object obj = this.f23381c;
        Object obj2 = this.f23382d;
        switch (i6) {
            case 0:
                return new b((s5) obj, (Application) obj2);
            case 1:
                return new rk.f((ChatUser) obj, (ChatUser) obj2);
            case 2:
                return new fm.a((Application) obj2, (j0) obj);
            case 3:
                return new a1((j1) obj, (Application) obj2);
            case 4:
                return new t1((Application) obj2, (dm.f) obj);
            case 5:
                return new ym.c((String) obj2);
            case 6:
                return new w((e1) obj, (Application) obj2);
            case 7:
                return new n0((e0) obj, (Application) obj2);
            default:
                return new h((Application) obj2, (f) obj);
        }
    }

    public c(s5 s5Var, MyApplication myApplication) {
        this.f23380b = 0;
        this.f23381c = s5Var;
        this.f23382d = myApplication;
    }

    public c(MyApplication myApplication, j0 j0Var) {
        this.f23380b = 2;
        this.f23382d = myApplication;
        this.f23381c = j0Var;
    }

    public c(Course course) {
        this.f23380b = 5;
        this.f23381c = course;
        this.f23382d = "en";
    }

    public c(j1 j1Var, MyApplication myApplication) {
        this.f23380b = 3;
        this.f23381c = j1Var;
        this.f23382d = myApplication;
    }

    public c(e0 e0Var, Application application) {
        this.f23380b = 7;
        this.f23381c = e0Var;
        this.f23382d = application;
    }

    public c(Application application, dm.f fVar) {
        this.f23380b = 4;
        this.f23382d = application;
        this.f23381c = fVar;
    }

    public c(e1 e1Var, Application application) {
        this.f23380b = 6;
        this.f23381c = e1Var;
        this.f23382d = application;
    }

    public c(ChatUser chatUser, ChatUser chatUser2) {
        this.f23380b = 1;
        this.f23381c = chatUser;
        this.f23382d = chatUser2;
    }
}
