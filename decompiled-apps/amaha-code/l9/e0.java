package l9;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.p;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class e0 extends ja.a {
    public e0() {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                    } else {
                        c.j(((a0) this).f24154b, parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    String readString = parcel.readString();
                    k9.f0 f0Var = ((a0) this).f24154b.f24167h;
                    if (f0Var != null) {
                        p.a aVar = new p.a();
                        aVar.f7418a = new androidx.appcompat.widget.l(f0Var, 17, readString);
                        aVar.f7421d = 8409;
                        f0Var.b(1, aVar.a());
                    }
                    parcel2.writeNoException();
                }
            } else {
                String readString2 = parcel.readString();
                k9.g gVar = (k9.g) com.google.android.gms.internal.cast.d.a(parcel, k9.g.CREATOR);
                final a0 a0Var = (a0) this;
                k9.f0 f0Var2 = a0Var.f24154b.f24167h;
                if (f0Var2 != null) {
                    p.a aVar2 = new p.a();
                    aVar2.f7418a = new s1.s(9, f0Var2, readString2, gVar);
                    aVar2.f7421d = 8406;
                    f0Var2.b(1, aVar2.a()).addOnCompleteListener(new ya.d(a0Var, 1) { // from class: l9.z

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ int f24195a;

                        /* renamed from: b  reason: collision with root package name */
                        public final a0 f24196b;

                        {
                            this.f24195a = r2;
                            this.f24196b = a0Var;
                        }

                        @Override // ya.d
                        public final void a(ya.h hVar) {
                            int i11 = this.f24195a;
                            a0 a0Var2 = this.f24196b;
                            switch (i11) {
                                case 0:
                                    c.k(a0Var2.f24154b, "joinApplication", hVar);
                                    return;
                                default:
                                    c.k(a0Var2.f24154b, "launchApplication", hVar);
                                    return;
                            }
                        }
                    });
                }
                parcel2.writeNoException();
            }
        } else {
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            final a0 a0Var2 = (a0) this;
            k9.f0 f0Var3 = a0Var2.f24154b.f24167h;
            if (f0Var3 != null) {
                p.a aVar3 = new p.a();
                aVar3.f7418a = new k9.z(f0Var3, readString3, readString4, 0);
                aVar3.f7421d = 8407;
                f0Var3.b(1, aVar3.a()).addOnCompleteListener(new ya.d(a0Var2, 0) { // from class: l9.z

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ int f24195a;

                    /* renamed from: b  reason: collision with root package name */
                    public final a0 f24196b;

                    {
                        this.f24195a = r2;
                        this.f24196b = a0Var2;
                    }

                    @Override // ya.d
                    public final void a(ya.h hVar) {
                        int i11 = this.f24195a;
                        a0 a0Var22 = this.f24196b;
                        switch (i11) {
                            case 0:
                                c.k(a0Var22.f24154b, "joinApplication", hVar);
                                return;
                            default:
                                c.k(a0Var22.f24154b, "launchApplication", hVar);
                                return;
                        }
                    }
                });
            }
            parcel2.writeNoException();
        }
        return true;
    }
}
