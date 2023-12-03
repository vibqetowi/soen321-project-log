package gv;

import is.u;
import java.util.Iterator;
import java.util.List;
/* compiled from: Strings.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.p<CharSequence, Integer, hs.f<? extends Integer, ? extends Integer>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<String> f16956u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f16957v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List<String> list, boolean z10) {
        super(2);
        this.f16956u = list;
        this.f16957v = z10;
    }

    @Override // ss.p
    public final hs.f<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object obj;
        hs.f fVar;
        Object obj2;
        CharSequence $receiver = charSequence;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g($receiver, "$this$$receiver");
        boolean z10 = this.f16957v;
        List<String> list = this.f16956u;
        if (!z10 && list.size() == 1) {
            String str = (String) u.x2(list);
            int O0 = r.O0($receiver, str, intValue, false, 4);
            if (O0 >= 0) {
                fVar = new hs.f(Integer.valueOf(O0), str);
            }
            fVar = null;
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            xs.f fVar2 = new xs.f(intValue, $receiver.length());
            boolean z11 = $receiver instanceof String;
            int i6 = fVar2.f37998w;
            int i10 = fVar2.f37997v;
            if (z11) {
                if ((i6 > 0 && intValue <= i10) || (i6 < 0 && i10 <= intValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (n.C0(0, intValue, str2.length(), str2, (String) $receiver, z10)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            fVar = new hs.f(Integer.valueOf(intValue), str3);
                            break;
                        } else if (intValue == i10) {
                            break;
                        } else {
                            intValue += i6;
                        }
                    }
                }
                fVar = null;
            } else {
                if ((i6 > 0 && intValue <= i10) || (i6 < 0 && i10 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (r.U0(str4, 0, $receiver, intValue, str4.length(), z10)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            fVar = new hs.f(Integer.valueOf(intValue), str5);
                            break;
                        } else if (intValue == i10) {
                            break;
                        } else {
                            intValue += i6;
                        }
                    }
                }
                fVar = null;
            }
        }
        if (fVar == null) {
            return null;
        }
        return new hs.f<>(fVar.f19464u, Integer.valueOf(((String) fVar.f19465v).length()));
    }
}
