package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {
    public static final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f25775g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25776a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f25777b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f25778c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f25779d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final HandlerC0420a f25780e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: n1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0420a extends Handler {
        public HandlerC0420a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            while (true) {
                synchronized (aVar.f25777b) {
                    size = aVar.f25779d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    aVar.f25779d.toArray(bVarArr);
                    aVar.f25779d.clear();
                }
                for (int i6 = 0; i6 < size; i6++) {
                    b bVar = bVarArr[i6];
                    int size2 = bVar.f25783b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        c cVar = bVar.f25783b.get(i10);
                        if (!cVar.f25787d) {
                            cVar.f25785b.onReceive(aVar.f25776a, bVar.f25782a);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f25782a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f25783b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f25782a = intent;
            this.f25783b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f25784a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f25785b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f25786c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f25787d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f25784a = intentFilter;
            this.f25785b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f25785b);
            sb2.append(" filter=");
            sb2.append(this.f25784a);
            if (this.f25787d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f25776a = context;
        this.f25780e = new HandlerC0420a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f) {
            if (f25775g == null) {
                f25775g = new a(context.getApplicationContext());
            }
            aVar = f25775g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f25777b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList<c> arrayList = this.f25777b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f25777b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i6 = 0; i6 < intentFilter.countActions(); i6++) {
                String action = intentFilter.getAction(i6);
                ArrayList<c> arrayList2 = this.f25778c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f25778c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public final boolean c(Intent intent) {
        boolean z10;
        ArrayList<c> arrayList;
        int i6;
        String str;
        String str2;
        synchronized (this.f25777b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f25776a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList2 = this.f25778c.get(intent.getAction());
            if (arrayList2 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    c cVar = arrayList2.get(i10);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f25784a);
                    }
                    if (cVar.f25786c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i6 = i10;
                        str = action;
                    } else {
                        arrayList = arrayList2;
                        i6 = i10;
                        str = action;
                        int match = cVar.f25784a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(cVar);
                            cVar.f25786c = true;
                        } else if (z10) {
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str2 = "unknown reason";
                                        } else {
                                            str2 = "type";
                                        }
                                    } else {
                                        str2 = "data";
                                    }
                                } else {
                                    str2 = "action";
                                }
                            } else {
                                str2 = "category";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i10 = i6 + 1;
                    arrayList2 = arrayList;
                    action = str;
                }
                if (arrayList3 != null) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        ((c) arrayList3.get(i11)).f25786c = false;
                    }
                    this.f25779d.add(new b(intent, arrayList3));
                    if (!this.f25780e.hasMessages(1)) {
                        this.f25780e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f25777b) {
            ArrayList<c> remove = this.f25777b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f25787d = true;
                for (int i6 = 0; i6 < cVar.f25784a.countActions(); i6++) {
                    String action = cVar.f25784a.getAction(i6);
                    ArrayList<c> arrayList = this.f25778c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f25785b == broadcastReceiver) {
                                cVar2.f25787d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f25778c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
