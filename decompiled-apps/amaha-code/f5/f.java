package f5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.appsflyer.R;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.i;
/* compiled from: CropImageOptions.kt */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public float F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public int K;
    public float L;
    public float M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final CharSequence Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Uri f14823a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Bitmap.CompressFormat f14824b0;
    public final int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f14825d0;
    public int e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f14826f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f14827g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f14828h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f14829i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f14830j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f14831k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f14832l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f14833m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f14834n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f14835o0;

    /* renamed from: p0  reason: collision with root package name */
    public final CharSequence f14836p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f14837q0;

    /* renamed from: u  reason: collision with root package name */
    public CropImageView.b f14838u;

    /* renamed from: v  reason: collision with root package name */
    public float f14839v;

    /* renamed from: w  reason: collision with root package name */
    public float f14840w;

    /* renamed from: x  reason: collision with root package name */
    public CropImageView.c f14841x;

    /* renamed from: y  reason: collision with root package name */
    public CropImageView.i f14842y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14843z;

    /* compiled from: CropImageOptions.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i6) {
            return new f[i6];
        }
    }

    public f() {
        Resources system = Resources.getSystem();
        i.f(system, "Resources.getSystem()");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        this.f14838u = CropImageView.b.RECTANGLE;
        this.f14839v = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f14840w = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f14841x = CropImageView.c.ON_TOUCH;
        this.f14842y = CropImageView.i.FIT_CENTER;
        this.f14843z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = 4;
        this.F = 0.1f;
        this.G = false;
        this.H = 1;
        this.I = 1;
        this.J = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.K = Color.argb(170, 255, 255, 255);
        this.L = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.M = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.N = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.O = -1;
        this.P = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.Q = Color.argb(170, 255, 255, 255);
        this.R = Color.argb((int) R.styleable.AppCompatTheme_windowActionModeOverlay, 0, 0, 0);
        this.S = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.T = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.U = 40;
        this.V = 40;
        this.W = 99999;
        this.X = 99999;
        this.Y = "";
        this.Z = 0;
        this.f14823a0 = Uri.EMPTY;
        this.f14824b0 = Bitmap.CompressFormat.JPEG;
        this.c0 = 90;
        this.f14825d0 = 0;
        this.e0 = 0;
        this.f14826f0 = 1;
        this.f14827g0 = false;
        this.f14828h0 = null;
        this.f14829i0 = -1;
        this.f14830j0 = true;
        this.f14831k0 = true;
        this.f14832l0 = false;
        this.f14833m0 = 90;
        this.f14834n0 = false;
        this.f14835o0 = false;
        this.f14836p0 = null;
        this.f14837q0 = 0;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25 = true;
        if (this.E >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f = 0;
            if (this.f14840w >= f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                float f2 = this.F;
                if (f2 >= f && f2 < 0.5d) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.H > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (this.I > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (this.J >= f) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (this.L >= f) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    if (this.P >= f) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        if (this.T >= 0) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (z18) {
                                            int i6 = this.U;
                                            if (i6 >= 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if (z19) {
                                                int i10 = this.V;
                                                if (i10 >= 0) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                if (z20) {
                                                    if (this.W >= i6) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    if (z21) {
                                                        if (this.X >= i10) {
                                                            z22 = true;
                                                        } else {
                                                            z22 = false;
                                                        }
                                                        if (z22) {
                                                            if (this.f14825d0 >= 0) {
                                                                z23 = true;
                                                            } else {
                                                                z23 = false;
                                                            }
                                                            if (z23) {
                                                                if (this.e0 >= 0) {
                                                                    z24 = true;
                                                                } else {
                                                                    z24 = false;
                                                                }
                                                                if (z24) {
                                                                    int i11 = this.f14833m0;
                                                                    if ((i11 < 0 || i11 > 360) ? false : false) {
                                                                        return;
                                                                    }
                                                                    throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360".toString());
                                                                }
                                                                throw new IllegalArgumentException("Cannot set request height value to a number < 0 ".toString());
                                                            }
                                                            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ".toString());
                                                        }
                                                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height".toString());
                                                    }
                                                    throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width".toString());
                                                }
                                                throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ".toString());
                                            }
                                            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ".toString());
                                        }
                                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ".toString());
                                    }
                                    throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.".toString());
                                }
                                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.".toString());
                            }
                            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.".toString());
                        }
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
                    }
                    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.".toString());
                }
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5".toString());
            }
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ".toString());
        }
        throw new IllegalArgumentException("Cannot set max zoom to a number < 1".toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        i.g(dest, "dest");
        dest.writeInt(this.f14838u.ordinal());
        dest.writeFloat(this.f14839v);
        dest.writeFloat(this.f14840w);
        dest.writeInt(this.f14841x.ordinal());
        dest.writeInt(this.f14842y.ordinal());
        dest.writeByte(this.f14843z ? (byte) 1 : (byte) 0);
        dest.writeByte(this.A ? (byte) 1 : (byte) 0);
        dest.writeByte(this.B ? (byte) 1 : (byte) 0);
        dest.writeByte(this.C ? (byte) 1 : (byte) 0);
        dest.writeByte(this.D ? (byte) 1 : (byte) 0);
        dest.writeInt(this.E);
        dest.writeFloat(this.F);
        dest.writeByte(this.G ? (byte) 1 : (byte) 0);
        dest.writeInt(this.H);
        dest.writeInt(this.I);
        dest.writeFloat(this.J);
        dest.writeInt(this.K);
        dest.writeFloat(this.L);
        dest.writeFloat(this.M);
        dest.writeFloat(this.N);
        dest.writeInt(this.O);
        dest.writeFloat(this.P);
        dest.writeInt(this.Q);
        dest.writeInt(this.R);
        dest.writeInt(this.S);
        dest.writeInt(this.T);
        dest.writeInt(this.U);
        dest.writeInt(this.V);
        dest.writeInt(this.W);
        dest.writeInt(this.X);
        TextUtils.writeToParcel(this.Y, dest, i6);
        dest.writeInt(this.Z);
        dest.writeParcelable(this.f14823a0, i6);
        dest.writeString(this.f14824b0.name());
        dest.writeInt(this.c0);
        dest.writeInt(this.f14825d0);
        dest.writeInt(this.e0);
        dest.writeInt(v.h.d(this.f14826f0));
        dest.writeInt(this.f14827g0 ? 1 : 0);
        dest.writeParcelable(this.f14828h0, i6);
        dest.writeInt(this.f14829i0);
        dest.writeByte(this.f14830j0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f14831k0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f14832l0 ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f14833m0);
        dest.writeByte(this.f14834n0 ? (byte) 1 : (byte) 0);
        dest.writeByte(this.f14835o0 ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f14836p0, dest, i6);
        dest.writeInt(this.f14837q0);
    }

    public f(Parcel parcel) {
        i.g(parcel, "parcel");
        this.f14838u = CropImageView.b.values()[parcel.readInt()];
        this.f14839v = parcel.readFloat();
        this.f14840w = parcel.readFloat();
        this.f14841x = CropImageView.c.values()[parcel.readInt()];
        this.f14842y = CropImageView.i.values()[parcel.readInt()];
        this.f14843z = parcel.readByte() != 0;
        this.A = parcel.readByte() != 0;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readInt();
        this.F = parcel.readFloat();
        this.G = parcel.readByte() != 0;
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readFloat();
        this.K = parcel.readInt();
        this.L = parcel.readFloat();
        this.M = parcel.readFloat();
        this.N = parcel.readFloat();
        this.O = parcel.readInt();
        this.P = parcel.readFloat();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        Object createFromParcel = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        i.f(createFromParcel, "TextUtils.CHAR_SEQUENCE_….createFromParcel(parcel)");
        this.Y = (CharSequence) createFromParcel;
        this.Z = parcel.readInt();
        this.f14823a0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString = parcel.readString();
        i.d(readString);
        this.f14824b0 = Bitmap.CompressFormat.valueOf(readString);
        this.c0 = parcel.readInt();
        this.f14825d0 = parcel.readInt();
        this.e0 = parcel.readInt();
        this.f14826f0 = v.h.e(5)[parcel.readInt()];
        this.f14827g0 = parcel.readByte() != 0;
        this.f14828h0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f14829i0 = parcel.readInt();
        this.f14830j0 = parcel.readByte() != 0;
        this.f14831k0 = parcel.readByte() != 0;
        this.f14832l0 = parcel.readByte() != 0;
        this.f14833m0 = parcel.readInt();
        this.f14834n0 = parcel.readByte() != 0;
        this.f14835o0 = parcel.readByte() != 0;
        this.f14836p0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14837q0 = parcel.readInt();
    }
}
