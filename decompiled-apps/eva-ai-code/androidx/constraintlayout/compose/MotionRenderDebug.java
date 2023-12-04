package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;
import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MotionRenderDebug {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    static final int MAX_KEY_FRAMES = 50;
    DashPathEffect mDashPathEffect;
    Paint mFillPaint;
    int mKeyFrameCount;
    float[] mKeyFramePoints;
    Paint mPaint;
    Paint mPaintGraph;
    Paint mPaintKeyframes;
    Path mPath;
    int[] mPathMode;
    float[] mPoints;
    private float[] mRectangle;
    int mShadowTranslate;
    Paint mTextPaint;
    final int RED_COLOR = -21965;
    final int KEYFRAME_COLOR = -2067046;
    final int GRAPH_COLOR = -13391360;
    final int SHADOW_COLOR = 1996488704;
    final int DIAMOND_SIZE = 10;
    Rect mBounds = new Rect();
    boolean mPresentationMode = false;

    public MotionRenderDebug(float textSize) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        this.mPaint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.mPaintKeyframes = paint2;
        paint2.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.mPaintGraph = paint3;
        paint3.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.mTextPaint = paint4;
        paint4.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(textSize);
        this.mRectangle = new float[8];
        Paint paint5 = new Paint();
        this.mFillPaint = paint5;
        paint5.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    public void draw(Canvas canvas, HashMap<String, Motion> frameArrayList, int duration, int debugPath, int layoutWidth, int layoutHeight) {
        if (frameArrayList == null || frameArrayList.size() == 0) {
            return;
        }
        canvas.save();
        for (Motion motion : frameArrayList.values()) {
            draw(canvas, motion, duration, debugPath, layoutWidth, layoutHeight);
        }
        canvas.restore();
    }

    public void draw(Canvas canvas, Motion motionController, int duration, int debugPath, int layoutWidth, int layoutHeight) {
        int drawPath = motionController.getDrawPath();
        if (debugPath > 0 && drawPath == 0) {
            drawPath = 1;
        }
        if (drawPath == 0) {
            return;
        }
        this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        if (drawPath >= 1) {
            int i = duration / 16;
            float[] fArr = this.mPoints;
            if (fArr == null || fArr.length != i * 2) {
                this.mPoints = new float[i * 2];
                this.mPath = new Path();
            }
            int i2 = this.mShadowTranslate;
            canvas.translate(i2, i2);
            this.mPaint.setColor(1996488704);
            this.mFillPaint.setColor(1996488704);
            this.mPaintKeyframes.setColor(1996488704);
            this.mPaintGraph.setColor(1996488704);
            motionController.buildPath(this.mPoints, i);
            int i3 = drawPath;
            drawAll(canvas, i3, this.mKeyFrameCount, motionController, layoutWidth, layoutHeight);
            this.mPaint.setColor(-21965);
            this.mPaintKeyframes.setColor(-2067046);
            this.mFillPaint.setColor(-2067046);
            this.mPaintGraph.setColor(-13391360);
            int i4 = this.mShadowTranslate;
            canvas.translate(-i4, -i4);
            drawAll(canvas, i3, this.mKeyFrameCount, motionController, layoutWidth, layoutHeight);
            if (drawPath == 5) {
                drawRectangle(canvas, motionController);
            }
        }
    }

    public void drawAll(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        if (mode == 4) {
            drawPathAsConfigured(canvas);
        }
        if (mode == 2) {
            drawPathRelative(canvas);
        }
        if (mode == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, mode, keyFrames, motionController, layoutWidth, layoutHeight);
    }

    private void drawBasicPath(Canvas canvas) {
        canvas.drawLines(this.mPoints, this.mPaint);
    }

    private void drawTicks(Canvas canvas, int mode, int keyFrames, Motion motionController, int layoutWidth, int layoutHeight) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        if (motionController.getView() != null) {
            i = motionController.getView().getWidth();
            i2 = motionController.getView().getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        for (int i4 = 1; i4 < keyFrames - 1; i4++) {
            if (mode != 4 || this.mPathMode[i4 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i5 = i4 * 2;
                float f3 = fArr[i5];
                float f4 = fArr[i5 + 1];
                this.mPath.reset();
                this.mPath.moveTo(f3, f4 + 10.0f);
                this.mPath.lineTo(f3 + 10.0f, f4);
                this.mPath.lineTo(f3, f4 - 10.0f);
                this.mPath.lineTo(f3 - 10.0f, f4);
                this.mPath.close();
                int i6 = i4 - 1;
                motionController.getKeyFrame(i6);
                if (mode == 4) {
                    int i7 = this.mPathMode[i6];
                    if (i7 == 1) {
                        drawPathRelativeTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i7 == 0) {
                        drawPathCartesianTicks(canvas, f3 - 0.0f, f4 - 0.0f);
                    } else if (i7 == 2) {
                        f = f4;
                        f2 = f3;
                        i3 = 2;
                        drawPathScreenTicks(canvas, f3 - 0.0f, f4 - 0.0f, i, i2, layoutWidth, layoutHeight);
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    }
                    f = f4;
                    f2 = f3;
                    i3 = 2;
                    canvas.drawPath(this.mPath, this.mFillPaint);
                } else {
                    f = f4;
                    f2 = f3;
                    i3 = 2;
                }
                if (mode == i3) {
                    drawPathRelativeTicks(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (mode == 3) {
                    drawPathCartesianTicks(canvas, f2 - 0.0f, f - 0.0f);
                }
                if (mode == 6) {
                    drawPathScreenTicks(canvas, f2 - 0.0f, f - 0.0f, i, i2, layoutWidth, layoutHeight);
                }
                canvas.drawPath(this.mPath, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        if (fArr2.length > 1) {
            canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
            float[] fArr3 = this.mPoints;
            canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private void drawTranslation(Canvas canvas, float x1, float y1, float x2, float y2) {
        canvas.drawRect(x1, y1, x2, y2, this.mPaintGraph);
        canvas.drawLine(x1, y1, x2, y2, this.mPaintGraph);
    }

    private void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
    }

    private void drawPathAsConfigured(Canvas canvas) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < this.mKeyFrameCount; i++) {
            int i2 = this.mPathMode[i];
            if (i2 == 1) {
                z = true;
            }
            if (i2 == 0) {
                z2 = true;
            }
        }
        if (z) {
            drawPathRelative(canvas);
        }
        if (z2) {
            drawPathCartesian(canvas);
        }
    }

    private void drawPathRelativeTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f - f3, f2 - f4);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = (((x - f) * f5) + ((y - f2) * f6)) / (hypot * hypot);
        float f8 = f + (f5 * f7);
        float f9 = f2 + (f7 * f6);
        Path path = new Path();
        path.moveTo(x, y);
        path.lineTo(f8, f9);
        float hypot2 = (float) Math.hypot(f8 - x, f9 - y);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(x, y, f8, f9, this.mPaintGraph);
    }

    void getTextBounds(String text, Paint paint) {
        paint.getTextBounds(text, 0, text.length(), this.mBounds);
    }

    private void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.mPaintGraph);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.mPaintGraph);
    }

    private void drawPathCartesianTicks(Canvas canvas, float x, float y) {
        float[] fArr = this.mPoints;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float min = Math.min(f, f3);
        float max = Math.max(f2, f4);
        float min2 = x - Math.min(f, f3);
        float max2 = Math.max(f2, f4) - y;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f3 - f)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, y - 20.0f, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(f, f3), y, this.mPaintGraph);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f4 - f2)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, x + 5.0f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(f2, f4), this.mPaintGraph);
    }

    private void drawPathScreenTicks(Canvas canvas, float x, float y, int viewWidth, int viewHeight, int layoutWidth, int layoutHeight) {
        String str = "" + (((int) ((((x - (viewWidth / 2)) * 100.0f) / (layoutWidth - viewWidth)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((x / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, y - 20.0f, this.mTextPaint);
        canvas.drawLine(x, y, Math.min(0.0f, 1.0f), y, this.mPaintGraph);
        String str2 = "" + (((int) ((((y - (viewHeight / 2)) * 100.0f) / (layoutHeight - viewHeight)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, x + 5.0f, 0.0f - ((y / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(x, y, x, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private void drawRectangle(Canvas canvas, Motion motionController) {
        this.mPath.reset();
        for (int i = 0; i <= 50; i++) {
            motionController.buildRect(i / 50, this.mRectangle, 0);
            Path path = this.mPath;
            float[] fArr = this.mRectangle;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.mPath;
            float[] fArr2 = this.mRectangle;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.mPath;
            float[] fArr3 = this.mRectangle;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.mPath;
            float[] fArr4 = this.mRectangle;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.mPath.close();
        }
        this.mPaint.setColor(1140850688);
        canvas.translate(2.0f, 2.0f);
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.translate(-2.0f, -2.0f);
        this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
        canvas.drawPath(this.mPath, this.mPaint);
    }
}
