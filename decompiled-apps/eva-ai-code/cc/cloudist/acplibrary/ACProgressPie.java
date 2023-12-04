package cc.cloudist.acplibrary;

import android.content.Context;
import android.content.DialogInterface;
import cc.cloudist.acplibrary.views.PieView;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public class ACProgressPie extends ACProgressBaseDialog {
    private Builder mBuilder;
    private PieView mPieView;
    private int mSpinCount;
    private Timer mTimer;

    static /* synthetic */ int access$208(ACProgressPie aCProgressPie) {
        int i = aCProgressPie.mSpinCount;
        aCProgressPie.mSpinCount = i + 1;
        return i;
    }

    private ACProgressPie(Builder builder) {
        super(builder.mContext);
        this.mSpinCount = 0;
        this.mBuilder = builder;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cc.cloudist.acplibrary.ACProgressPie.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ACProgressPie.this.mTimer != null) {
                    ACProgressPie.this.mTimer.cancel();
                    ACProgressPie.this.mTimer = null;
                }
                ACProgressPie.this.mSpinCount = 0;
                ACProgressPie.this.mPieView = null;
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.mPieView == null) {
            this.mPieView = new PieView(this.mBuilder.mContext, (int) (getMinimumSideOfScreen(this.mBuilder.mContext) * this.mBuilder.mSizeRatio), this.mBuilder.mBackgroundColor, this.mBuilder.mBackgroundAlpha, this.mBuilder.mBackgroundCornerRadius, this.mBuilder.mRingBorderPadding, this.mBuilder.mPieRingDistance, this.mBuilder.mRingThickness, this.mBuilder.mRingColor, this.mBuilder.mRingAlpha, this.mBuilder.mPieColor, this.mBuilder.mPieAlpha);
        }
        super.setContentView(this.mPieView);
        super.show();
        if (this.mBuilder.mUpdateType == 200) {
            long j = 1000.0f / this.mBuilder.mSpeed;
            Timer timer = new Timer();
            this.mTimer = timer;
            timer.scheduleAtFixedRate(new TimerTask() { // from class: cc.cloudist.acplibrary.ACProgressPie.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    int i = ACProgressPie.this.mSpinCount % (ACProgressPie.this.mBuilder.mPieces + 1);
                    ACProgressPie.this.mPieView.updateAngle((360.0f / ACProgressPie.this.mBuilder.mPieces) * i);
                    if (i == 0) {
                        ACProgressPie.this.mSpinCount = 1;
                    } else {
                        ACProgressPie.access$208(ACProgressPie.this);
                    }
                }
            }, j, j);
        }
    }

    public void setPiePercentage(float f) {
        PieView pieView;
        if (this.mBuilder.mUpdateType != 201 || (pieView = this.mPieView) == null) {
            return;
        }
        pieView.updateAngle(f * 360.0f);
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        private Context mContext;
        private float mSizeRatio = 0.25f;
        private int mBackgroundColor = -16777216;
        private float mBackgroundCornerRadius = 20.0f;
        private float mBackgroundAlpha = 0.5f;
        private int mRingColor = -1;
        private float mRingAlpha = 0.9f;
        private float mRingBorderPadding = 0.2f;
        private int mRingThickness = 3;
        private int mPieColor = -1;
        private float mPieAlpha = 0.9f;
        private float mPieRingDistance = 0.08f;
        private float mSpeed = 6.67f;
        private int mPieces = 100;
        private int mUpdateType = 200;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder sizeRatio(float f) {
            this.mSizeRatio = f;
            return this;
        }

        public Builder bgColor(int i) {
            this.mBackgroundColor = i;
            return this;
        }

        public Builder bgAlpha(float f) {
            this.mBackgroundAlpha = f;
            return this;
        }

        public Builder bgCornerRadius(float f) {
            this.mBackgroundCornerRadius = f;
            return this;
        }

        public Builder ringColor(int i) {
            this.mRingColor = i;
            return this;
        }

        public Builder ringAlpha(float f) {
            this.mRingAlpha = f;
            return this;
        }

        public Builder ringBorderPadding(float f) {
            this.mRingBorderPadding = f;
            return this;
        }

        public Builder ringThickness(int i) {
            this.mRingThickness = i;
            return this;
        }

        public Builder pieColor(int i) {
            this.mPieColor = i;
            return this;
        }

        public Builder pieAlpha(float f) {
            this.mPieAlpha = f;
            return this;
        }

        public Builder pieRingDistance(float f) {
            this.mPieRingDistance = f;
            return this;
        }

        public Builder speed(float f) {
            this.mSpeed = f;
            return this;
        }

        public Builder pieces(int i) {
            this.mPieces = i;
            return this;
        }

        public Builder updateType(int i) {
            this.mUpdateType = i;
            return this;
        }

        public ACProgressPie build() {
            return new ACProgressPie(this);
        }
    }
}
