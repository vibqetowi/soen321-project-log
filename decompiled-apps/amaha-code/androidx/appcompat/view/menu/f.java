package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import g0.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t0.f0;
/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class f implements m0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f1092y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f1093a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f1094b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1095c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1096d;

    /* renamed from: e  reason: collision with root package name */
    public a f1097e;
    public final ArrayList<h> f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f1098g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1099h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<h> f1100i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f1101j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1102k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1104m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f1105n;

    /* renamed from: o  reason: collision with root package name */
    public View f1106o;

    /* renamed from: v  reason: collision with root package name */
    public h f1112v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1114x;

    /* renamed from: l  reason: collision with root package name */
    public int f1103l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1107p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1108q = false;
    public boolean r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1109s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<h> f1110t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f1111u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f1113w = false;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f1093a = context;
        Resources resources = context.getResources();
        this.f1094b = resources;
        this.f = new ArrayList<>();
        this.f1098g = new ArrayList<>();
        this.f1099h = true;
        this.f1100i = new ArrayList<>();
        this.f1101j = new ArrayList<>();
        this.f1102k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = f0.f32310a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = f0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f1096d = z11;
    }

    public h a(int i6, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f1092y[i13] << 16) | (65535 & i11);
            h hVar = new h(this, i6, i10, i11, i14, charSequence, this.f1103l);
            ArrayList<h> arrayList = this.f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f1121d <= i14) {
                        i12 = size + 1;
                        break;
                    }
                } else {
                    i12 = 0;
                    break;
                }
            }
            arrayList.add(i12, hVar);
            p(true);
            return hVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f1093a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            if (i16 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i16];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a10 = a(i6, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f1123g = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a10;
            }
        }
        return i13;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f1111u.add(new WeakReference<>(jVar));
        jVar.h(context, this);
        this.f1102k = true;
    }

    public final void c(boolean z10) {
        if (this.f1109s) {
            return;
        }
        this.f1109s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f1109s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f1112v;
        if (hVar != null) {
            d(hVar);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f1105n = null;
        this.f1104m = null;
        this.f1106o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1112v == hVar) {
            z();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = jVar.g(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            y();
            if (z10) {
                this.f1112v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f1097e;
        if (aVar != null && aVar.a(fVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        z();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = jVar.m(hVar);
                if (z10) {
                    break;
                }
            }
        }
        y();
        if (z10) {
            this.f1112v = hVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        MenuItem findItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f.get(i10);
            if (hVar.f1118a == i6) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f1131o.findItem(i6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i6, KeyEvent keyEvent) {
        char c10;
        ArrayList<h> arrayList = this.f1110t;
        arrayList.clear();
        h(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (n10) {
                c10 = hVar.f1126j;
            } else {
                c10 = hVar.f1124h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i6 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return this.f.get(i6);
    }

    public final void h(ArrayList arrayList, int i6, KeyEvent keyEvent) {
        char c10;
        int i10;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i6 != 67) {
            return;
        }
        ArrayList<h> arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList2.get(i11);
            if (hVar.hasSubMenu()) {
                hVar.f1131o.h(arrayList, i6, keyEvent);
            }
            if (n10) {
                c10 = hVar.f1126j;
            } else {
                c10 = hVar.f1124h;
            }
            if (n10) {
                i10 = hVar.f1127k;
            } else {
                i10 = hVar.f1125i;
            }
            if ((modifiers & 69647) == (i10 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c10 != 0) {
                char[] cArr = keyData.meta;
                if (c10 != cArr[0] && c10 != cArr[2]) {
                    if (n10 && c10 == '\b') {
                        if (i6 != 67) {
                        }
                    }
                }
                if (hVar.isEnabled()) {
                    arrayList.add(hVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f1114x) {
            return true;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f.get(i6).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z10;
        ArrayList<h> l2 = l();
        if (!this.f1102k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z11 |= jVar.e();
            }
        }
        ArrayList<h> arrayList = this.f1100i;
        ArrayList<h> arrayList2 = this.f1101j;
        if (z11) {
            arrayList.clear();
            arrayList2.clear();
            int size = l2.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = l2.get(i6);
                if ((hVar.f1139x & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(hVar);
                } else {
                    arrayList2.add(hVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f1102k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        if (g(i6, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f1099h;
        ArrayList<h> arrayList = this.f1098g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            h hVar = arrayList2.get(i6);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f1099h = false;
        this.f1102k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f1113w;
    }

    public boolean n() {
        return this.f1095c;
    }

    public boolean o() {
        return this.f1096d;
    }

    public void p(boolean z10) {
        if (!this.f1107p) {
            if (z10) {
                this.f1099h = true;
                this.f1102k = true;
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
            if (!copyOnWriteArrayList.isEmpty()) {
                z();
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        jVar.d(z10);
                    }
                }
                y();
                return;
            }
            return;
        }
        this.f1108q = true;
        if (z10) {
            this.r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i10) {
        return q(findItem(i6), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i10) {
        boolean z10;
        h g5 = g(i6, keyEvent);
        if (g5 != null) {
            z10 = q(g5, null, i10);
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, j jVar, int i6) {
        boolean z10;
        t0.b bVar;
        boolean z11;
        h hVar = (h) menuItem;
        boolean z12 = false;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = hVar.f1132p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(hVar)) {
            f fVar = hVar.f1130n;
            if (!fVar.e(fVar, hVar)) {
                Intent intent = hVar.f1123g;
                if (intent != null) {
                    try {
                        fVar.f1093a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    }
                }
                t0.b bVar2 = hVar.A;
                if (bVar2 == null || !bVar2.e()) {
                    z10 = false;
                    bVar = hVar.A;
                    if (bVar == null && bVar.a()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!hVar.e()) {
                        z10 |= hVar.expandActionView();
                        if (z10) {
                            c(true);
                        }
                    } else if (!hVar.hasSubMenu() && !z11) {
                        if ((i6 & 1) == 0) {
                            c(true);
                        }
                    } else {
                        if ((i6 & 4) == 0) {
                            c(false);
                        }
                        if (!hVar.hasSubMenu()) {
                            m mVar = new m(this.f1093a, this, hVar);
                            hVar.f1131o = mVar;
                            mVar.setHeaderTitle(hVar.f1122e);
                        }
                        m mVar2 = hVar.f1131o;
                        if (z11) {
                            bVar.f(mVar2);
                        }
                        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (jVar != null) {
                                z12 = jVar.k(mVar2);
                            }
                            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference<j> next = it.next();
                                j jVar2 = next.get();
                                if (jVar2 == null) {
                                    copyOnWriteArrayList.remove(next);
                                } else if (!z12) {
                                    z12 = jVar2.k(mVar2);
                                }
                            }
                        }
                        z10 |= z12;
                        if (!z10) {
                            c(true);
                        }
                    }
                    return z10;
                }
            }
        }
        z10 = true;
        bVar = hVar.A;
        if (bVar == null) {
        }
        z11 = false;
        if (!hVar.e()) {
        }
        return z10;
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        ArrayList<h> arrayList;
        int size = size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f;
            if (i11 < size) {
                if (arrayList.get(i11).f1119b == i6) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || arrayList.get(i11).f1119b != i6) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        ArrayList<h> arrayList;
        int size = size();
        int i10 = 0;
        while (true) {
            arrayList = this.f;
            if (i10 < size) {
                if (arrayList.get(i10).f1118a == i6) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 > 0 && (findItem = findItem(i10)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z10, boolean z11) {
        ArrayList<h> arrayList = this.f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f1119b == i6) {
                hVar.f(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1113w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z10) {
        ArrayList<h> arrayList = this.f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f1119b == i6) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z10) {
        int i10;
        boolean z11;
        ArrayList<h> arrayList = this.f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f1119b == i6) {
                int i12 = hVar.f1139x;
                int i13 = i12 & (-9);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                hVar.f1139x = i14;
                if (i12 != i14) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1095c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        int id2 = jVar.getId();
                        if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            jVar.i(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable l2;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f1111u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (l2 = jVar.l()) != null) {
                        sparseArray.put(id2, l2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void w(a aVar) {
        this.f1097e = aVar;
    }

    public final void x(int i6, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f1106o = view;
            this.f1104m = null;
            this.f1105n = null;
        } else {
            if (i6 > 0) {
                this.f1104m = this.f1094b.getText(i6);
            } else if (charSequence != null) {
                this.f1104m = charSequence;
            }
            if (i10 > 0) {
                Object obj = g0.a.f16164a;
                this.f1105n = a.c.b(this.f1093a, i10);
            } else if (drawable != null) {
                this.f1105n = drawable;
            }
            this.f1106o = null;
        }
        p(false);
    }

    public final void y() {
        this.f1107p = false;
        if (this.f1108q) {
            this.f1108q = false;
            p(this.r);
        }
    }

    public final void z() {
        if (!this.f1107p) {
            this.f1107p = true;
            this.f1108q = false;
            this.r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return a(0, 0, 0, this.f1094b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f1094b.getString(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, CharSequence charSequence) {
        return a(i6, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i10, int i11, CharSequence charSequence) {
        h a10 = a(i6, i10, i11, charSequence);
        m mVar = new m(this.f1093a, this, a10);
        a10.f1131o = mVar;
        mVar.setHeaderTitle(a10.f1122e);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, int i12) {
        return a(i6, i10, i11, this.f1094b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, int i12) {
        return addSubMenu(i6, i10, i11, this.f1094b.getString(i12));
    }

    public f k() {
        return this;
    }
}
