package f0;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final b f14636a;

    /* compiled from: FrameMetricsAggregator.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public static HandlerThread f14637e;
        public static Handler f;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f14639b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f14640c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final Window$OnFrameMetricsAvailableListenerC0227a f14641d = new Window$OnFrameMetricsAvailableListenerC0227a();

        /* renamed from: a  reason: collision with root package name */
        public final int f14638a = 1;

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: f0.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Window$OnFrameMetricsAvailableListenerC0227a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC0227a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i6) {
                long metric;
                long metric2;
                long metric3;
                long metric4;
                long metric5;
                long metric6;
                long metric7;
                long metric8;
                long metric9;
                a aVar = a.this;
                if ((aVar.f14638a & 1) != 0) {
                    SparseIntArray sparseIntArray = aVar.f14639b[0];
                    metric9 = frameMetrics.getMetric(8);
                    a.e(sparseIntArray, metric9);
                }
                a aVar2 = a.this;
                if ((aVar2.f14638a & 2) != 0) {
                    SparseIntArray sparseIntArray2 = aVar2.f14639b[1];
                    metric8 = frameMetrics.getMetric(1);
                    a.e(sparseIntArray2, metric8);
                }
                a aVar3 = a.this;
                if ((aVar3.f14638a & 4) != 0) {
                    SparseIntArray sparseIntArray3 = aVar3.f14639b[2];
                    metric7 = frameMetrics.getMetric(3);
                    a.e(sparseIntArray3, metric7);
                }
                a aVar4 = a.this;
                if ((aVar4.f14638a & 8) != 0) {
                    SparseIntArray sparseIntArray4 = aVar4.f14639b[3];
                    metric6 = frameMetrics.getMetric(4);
                    a.e(sparseIntArray4, metric6);
                }
                a aVar5 = a.this;
                if ((aVar5.f14638a & 16) != 0) {
                    SparseIntArray sparseIntArray5 = aVar5.f14639b[4];
                    metric5 = frameMetrics.getMetric(5);
                    a.e(sparseIntArray5, metric5);
                }
                a aVar6 = a.this;
                if ((aVar6.f14638a & 64) != 0) {
                    SparseIntArray sparseIntArray6 = aVar6.f14639b[6];
                    metric4 = frameMetrics.getMetric(7);
                    a.e(sparseIntArray6, metric4);
                }
                a aVar7 = a.this;
                if ((aVar7.f14638a & 32) != 0) {
                    SparseIntArray sparseIntArray7 = aVar7.f14639b[5];
                    metric3 = frameMetrics.getMetric(6);
                    a.e(sparseIntArray7, metric3);
                }
                a aVar8 = a.this;
                if ((aVar8.f14638a & 128) != 0) {
                    SparseIntArray sparseIntArray8 = aVar8.f14639b[7];
                    metric2 = frameMetrics.getMetric(0);
                    a.e(sparseIntArray8, metric2);
                }
                a aVar9 = a.this;
                if ((aVar9.f14638a & 256) != 0) {
                    SparseIntArray sparseIntArray9 = aVar9.f14639b[8];
                    metric = frameMetrics.getMetric(2);
                    a.e(sparseIntArray9, metric);
                }
            }
        }

        public static void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i6 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i6, sparseIntArray.get(i6) + 1);
                }
            }
        }

        @Override // f0.l.b
        public final void a(Activity activity) {
            if (f14637e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f14637e = handlerThread;
                handlerThread.start();
                f = new Handler(f14637e.getLooper());
            }
            for (int i6 = 0; i6 <= 8; i6++) {
                SparseIntArray[] sparseIntArrayArr = this.f14639b;
                if (sparseIntArrayArr[i6] == null && (this.f14638a & (1 << i6)) != 0) {
                    sparseIntArrayArr[i6] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f14641d, f);
            this.f14640c.add(new WeakReference<>(activity));
        }

        @Override // f0.l.b
        public final SparseIntArray[] b() {
            return this.f14639b;
        }

        @Override // f0.l.b
        public final SparseIntArray[] c(Activity activity) {
            ArrayList<WeakReference<Activity>> arrayList = this.f14640c;
            Iterator<WeakReference<Activity>> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    arrayList.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f14641d);
            return this.f14639b;
        }

        @Override // f0.l.b
        public final SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f14639b;
            this.f14639b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }

    public l() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14636a = new a();
        } else {
            this.f14636a = new b();
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* loaded from: classes.dex */
    public static class b {
        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
