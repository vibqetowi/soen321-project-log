package m9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class f extends w9.a {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final z Z;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f24976u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f24977v;

    /* renamed from: w  reason: collision with root package name */
    public final long f24978w;

    /* renamed from: x  reason: collision with root package name */
    public final String f24979x;

    /* renamed from: y  reason: collision with root package name */
    public final int f24980y;

    /* renamed from: z  reason: collision with root package name */
    public final int f24981z;

    /* renamed from: a0  reason: collision with root package name */
    public static final List<String> f24974a0 = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f24975b0 = {0, 1};
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
    /* loaded from: classes.dex */
    public static final class a {
        public static int a(String str) {
            try {
                Map<String, Integer> map = ResourceProvider.f7284a;
                Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }
    }

    public f(@RecentlyNonNull List<String> list, @RecentlyNonNull int[] iArr, long j10, @RecentlyNonNull String str, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder) {
        z yVar;
        this.f24976u = new ArrayList(list);
        this.f24977v = Arrays.copyOf(iArr, iArr.length);
        this.f24978w = j10;
        this.f24979x = str;
        this.f24980y = i6;
        this.f24981z = i10;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        this.E = i15;
        this.F = i16;
        this.G = i17;
        this.H = i18;
        this.I = i19;
        this.J = i20;
        this.K = i21;
        this.L = i22;
        this.M = i23;
        this.N = i24;
        this.O = i25;
        this.P = i26;
        this.Q = i27;
        this.R = i28;
        this.S = i29;
        this.T = i30;
        this.U = i31;
        this.V = i32;
        this.W = i33;
        this.X = i34;
        this.Y = i35;
        if (iBinder == null) {
            this.Z = null;
            return;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof z) {
            yVar = (z) queryLocalInterface;
        } else {
            yVar = new y(iBinder);
        }
        this.Z = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        IBinder asBinder;
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.y0(parcel, 2, this.f24976u);
        int[] iArr = this.f24977v;
        hc.d.t0(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        hc.d.u0(parcel, 4, this.f24978w);
        hc.d.x0(parcel, 5, this.f24979x);
        hc.d.s0(parcel, 6, this.f24980y);
        hc.d.s0(parcel, 7, this.f24981z);
        hc.d.s0(parcel, 8, this.A);
        hc.d.s0(parcel, 9, this.B);
        hc.d.s0(parcel, 10, this.C);
        hc.d.s0(parcel, 11, this.D);
        hc.d.s0(parcel, 12, this.E);
        hc.d.s0(parcel, 13, this.F);
        hc.d.s0(parcel, 14, this.G);
        hc.d.s0(parcel, 15, this.H);
        hc.d.s0(parcel, 16, this.I);
        hc.d.s0(parcel, 17, this.J);
        hc.d.s0(parcel, 18, this.K);
        hc.d.s0(parcel, 19, this.L);
        hc.d.s0(parcel, 20, this.M);
        hc.d.s0(parcel, 21, this.N);
        hc.d.s0(parcel, 22, this.O);
        hc.d.s0(parcel, 23, this.P);
        hc.d.s0(parcel, 24, this.Q);
        hc.d.s0(parcel, 25, this.R);
        hc.d.s0(parcel, 26, this.S);
        hc.d.s0(parcel, 27, this.T);
        hc.d.s0(parcel, 28, this.U);
        hc.d.s0(parcel, 29, this.V);
        hc.d.s0(parcel, 30, this.W);
        hc.d.s0(parcel, 31, this.X);
        hc.d.s0(parcel, 32, this.Y);
        z zVar = this.Z;
        if (zVar == null) {
            asBinder = null;
        } else {
            asBinder = zVar.asBinder();
        }
        hc.d.r0(parcel, 33, asBinder);
        hc.d.C0(parcel, B0);
    }
}
