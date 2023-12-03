package e9;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import e9.d;
import e9.j;
/* compiled from: TouchTracker.java */
/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: w  reason: collision with root package name */
    public final a f13924w;

    /* renamed from: y  reason: collision with root package name */
    public final GestureDetector f13926y;

    /* renamed from: u  reason: collision with root package name */
    public final PointF f13922u = new PointF();

    /* renamed from: v  reason: collision with root package name */
    public final PointF f13923v = new PointF();

    /* renamed from: x  reason: collision with root package name */
    public final float f13925x = 25.0f;

    /* renamed from: z  reason: collision with root package name */
    public volatile float f13927z = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public k(Context context, j.a aVar) {
        this.f13924w = aVar;
        this.f13926y = new GestureDetector(context, this);
    }

    @Override // e9.d.a
    public final void a(float f, float[] fArr) {
        this.f13927z = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f13922u.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x10 = (motionEvent2.getX() - this.f13922u.x) / this.f13925x;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f13922u;
        float f10 = (y10 - pointF.y) / this.f13925x;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f13927z;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f13923v;
        pointF2.x -= (cos * x10) - (sin * f10);
        float f11 = (cos * f10) + (sin * x10) + pointF2.y;
        pointF2.y = f11;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f11));
        a aVar = this.f13924w;
        PointF pointF3 = this.f13923v;
        j.a aVar2 = (j.a) aVar;
        synchronized (aVar2) {
            float f12 = pointF3.y;
            aVar2.A = f12;
            Matrix.setRotateM(aVar2.f13920y, 0, -f12, (float) Math.cos(aVar2.B), (float) Math.sin(aVar2.B), 0.0f);
            Matrix.setRotateM(aVar2.f13921z, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return j.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f13926y.onTouchEvent(motionEvent);
    }
}
