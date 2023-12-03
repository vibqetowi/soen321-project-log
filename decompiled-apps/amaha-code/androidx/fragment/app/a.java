package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.h0;
import androidx.fragment.app.y;
import androidx.lifecycle.j;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends h0 implements y.n {

    /* renamed from: q  reason: collision with root package name */
    public final y f2130q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public int f2131s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2132t;

    public a(y yVar) {
        yVar.K();
        u<?> uVar = yVar.f2324v;
        if (uVar != null) {
            uVar.f2292v.getClassLoader();
        }
        this.f2131s = -1;
        this.f2132t = false;
        this.f2130q = yVar;
    }

    @Override // androidx.fragment.app.y.n
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.P(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2196g) {
            y yVar = this.f2130q;
            if (yVar.f2308d == null) {
                yVar.f2308d = new ArrayList<>();
            }
            yVar.f2308d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.h0
    public final void e(int i6, Fragment fragment, String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            h1.a.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i6 != 0) {
                if (i6 != -1) {
                    int i11 = fragment.mFragmentId;
                    if (i11 != 0 && i11 != i6) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i6);
                    }
                    fragment.mFragmentId = i6;
                    fragment.mContainerId = i6;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new h0.a(fragment, i10));
            fragment.mFragmentManager = this.f2130q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void i(int i6) {
        h0.a aVar;
        if (!this.f2196g) {
            return;
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
        }
        ArrayList<h0.a> arrayList = this.f2191a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment fragment = arrayList.get(i10).f2207b;
            if (fragment != null) {
                fragment.mBackStackNesting += i6;
                if (y.P(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + aVar.f2207b + " to " + aVar.f2207b.mBackStackNesting);
                }
            }
        }
    }

    public final int j() {
        return l(false);
    }

    public final int k() {
        return l(true);
    }

    public final int l(boolean z10) {
        if (!this.r) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new q0());
                n("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z11 = this.f2196g;
            y yVar = this.f2130q;
            if (z11) {
                this.f2131s = yVar.f2312i.getAndIncrement();
            } else {
                this.f2131s = -1;
            }
            yVar.w(this, z10);
            return this.f2131s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void m() {
        if (!this.f2196g) {
            this.f2197h = false;
            this.f2130q.z(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void n(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2198i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2131s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f2192b != 0 || this.f2193c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2192b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2193c));
            }
            if (this.f2194d != 0 || this.f2195e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2194d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2195e));
            }
            if (this.f2199j != 0 || this.f2200k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2199j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2200k);
            }
            if (this.f2201l != 0 || this.f2202m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2201l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2202m);
            }
        }
        ArrayList<h0.a> arrayList = this.f2191a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                h0.a aVar = arrayList.get(i6);
                switch (aVar.f2206a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2206a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2207b);
                if (z10) {
                    if (aVar.f2209d != 0 || aVar.f2210e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2209d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2210e));
                    }
                    if (aVar.f != 0 || aVar.f2211g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2211g));
                    }
                }
            }
        }
    }

    public final a o(Fragment fragment) {
        y yVar = fragment.mFragmentManager;
        if (yVar != null && yVar != this.f2130q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new h0.a(fragment, 3));
        return this;
    }

    public final a p(Fragment fragment, j.c cVar) {
        y yVar = fragment.mFragmentManager;
        y yVar2 = this.f2130q;
        if (yVar == yVar2) {
            if (cVar == j.c.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != j.c.DESTROYED) {
                b(new h0.a(fragment, cVar));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + yVar2);
    }

    public final a q(Fragment fragment) {
        y yVar;
        if (fragment != null && (yVar = fragment.mFragmentManager) != null && yVar != this.f2130q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new h0.a(fragment, 8));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2131s >= 0) {
            sb2.append(" #");
            sb2.append(this.f2131s);
        }
        if (this.f2198i != null) {
            sb2.append(" ");
            sb2.append(this.f2198i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public a(a aVar) {
        aVar.f2130q.K();
        u<?> uVar = aVar.f2130q.f2324v;
        if (uVar != null) {
            uVar.f2292v.getClassLoader();
        }
        Iterator<h0.a> it = aVar.f2191a.iterator();
        while (it.hasNext()) {
            this.f2191a.add(new h0.a(it.next()));
        }
        this.f2192b = aVar.f2192b;
        this.f2193c = aVar.f2193c;
        this.f2194d = aVar.f2194d;
        this.f2195e = aVar.f2195e;
        this.f = aVar.f;
        this.f2196g = aVar.f2196g;
        this.f2197h = aVar.f2197h;
        this.f2198i = aVar.f2198i;
        this.f2201l = aVar.f2201l;
        this.f2202m = aVar.f2202m;
        this.f2199j = aVar.f2199j;
        this.f2200k = aVar.f2200k;
        if (aVar.f2203n != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f2203n = arrayList;
            arrayList.addAll(aVar.f2203n);
        }
        if (aVar.f2204o != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f2204o = arrayList2;
            arrayList2.addAll(aVar.f2204o);
        }
        this.f2205p = aVar.f2205p;
        this.f2131s = -1;
        this.f2132t = false;
        this.f2130q = aVar.f2130q;
        this.r = aVar.r;
        this.f2131s = aVar.f2131s;
        this.f2132t = aVar.f2132t;
    }
}
