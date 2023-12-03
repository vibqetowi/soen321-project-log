package rg;

import ad.h;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import g9.a;
import hh.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: AdIdHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AdIdHelper.kt */
    /* renamed from: rg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0522a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final C0522a f30714u = new C0522a();

        public C0522a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_AdIdHelper getAdvertisementInfo() : Google Play Services not found.";
        }
    }

    /* compiled from: AdIdHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f30715u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_AdIdHelper getAdvertisementInfo() : Google Play Services repairing.";
        }
    }

    /* compiled from: AdIdHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f30716u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_AdIdHelper getAdvertisementInfo() : ";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[Catch: Exception -> 0x0023, GooglePlayServicesRepairableException -> 0x002c, GooglePlayServicesNotAvailableException -> 0x0034, TRY_LEAVE, TryCatch #2 {GooglePlayServicesNotAvailableException -> 0x0034, GooglePlayServicesRepairableException -> 0x002c, Exception -> 0x0023, blocks: (B:3:0x0007, B:5:0x000f, B:11:0x001b), top: B:19:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h a(Context context) {
        boolean z10;
        i.g(context, "context");
        try {
            a.C0248a a10 = g9.a.a(context);
            String str = a10.f16386a;
            if (str != null && str.length() != 0) {
                z10 = false;
                if (z10) {
                    return new h(str, a10.f16387b ? 1 : 0, 2);
                }
                return null;
            }
            z10 = true;
            if (z10) {
            }
        } catch (GooglePlayServicesNotAvailableException unused) {
            hh.a aVar = g.f17610d;
            g.a.b(1, C0522a.f30714u, 2);
            return null;
        } catch (GooglePlayServicesRepairableException unused2) {
            hh.a aVar2 = g.f17610d;
            g.a.b(1, b.f30715u, 2);
            return null;
        } catch (Exception e10) {
            hh.a aVar3 = g.f17610d;
            g.a.a(1, e10, c.f30716u);
            return null;
        }
    }
}
