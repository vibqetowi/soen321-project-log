package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.workaround.ExcludedSupportedSizesContainer;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class SupportedSurfaceCombination {
    private static final int ALIGN16 = 16;
    private static final String TAG = "SupportedSurfaceCombination";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DisplayInfoManager mDisplayInfoManager;
    private final ExcludedSupportedSizesContainer mExcludedSupportedSizesContainer;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private final boolean mIsSensorLandscapeResolution;
    private SurfaceSizeDefinition mSurfaceSizeDefinition;
    private static final Size DEFAULT_SIZE = new Size(640, 480);
    private static final Size ZERO_SIZE = new Size(0, 0);
    private static final Size QUALITY_1080P_SIZE = new Size(1920, 1080);
    private static final Size QUALITY_480P_SIZE = new Size(720, 480);
    private static final Rational ASPECT_RATIO_4_3 = new Rational(4, 3);
    private static final Rational ASPECT_RATIO_3_4 = new Rational(3, 4);
    private static final Rational ASPECT_RATIO_16_9 = new Rational(16, 9);
    private static final Rational ASPECT_RATIO_9_16 = new Rational(9, 16);
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private final Map<Integer, Size> mMaxSizeCache = new HashMap();
    private final Map<Integer, List<Size>> mExcludedSizeListCache = new HashMap();
    private boolean mIsRawSupported = false;
    private boolean mIsBurstCaptureSupported = false;
    private Map<Integer, Size[]> mOutputSizesCache = new HashMap();
    private final ResolutionCorrector mResolutionCorrector = new ResolutionCorrector();

    private void checkCustomization() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException {
        String str2 = (String) Preconditions.checkNotNull(str);
        this.mCameraId = str2;
        this.mCamcorderProfileHelper = (CamcorderProfileHelper) Preconditions.checkNotNull(camcorderProfileHelper);
        this.mExcludedSupportedSizesContainer = new ExcludedSupportedSizesContainer(str);
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str2);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mHardwareLevel = num != null ? num.intValue() : 2;
            this.mIsSensorLandscapeResolution = isSensorLandscapeResolution();
            generateSupportedCombinationList();
            generateSurfaceSizeDefinition();
            checkCustomization();
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    String getCameraId() {
        return this.mCameraId;
    }

    boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean checkSupported(List<SurfaceConfig> list) {
        Iterator<SurfaceCombination> it = this.mSurfaceCombinations.iterator();
        boolean z = false;
        while (it.hasNext() && !(z = it.next().isSupported(list))) {
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceConfig transformSurfaceConfig(int i, Size size) {
        SurfaceConfig.ConfigType configType = getConfigType(i);
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        Size fetchMaxSize = fetchMaxSize(i);
        if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getAnalysisSize().getWidth() * this.mSurfaceSizeDefinition.getAnalysisSize().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getPreviewSize().getWidth() * this.mSurfaceSizeDefinition.getPreviewSize().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.mSurfaceSizeDefinition.getRecordSize().getWidth() * this.mSurfaceSizeDefinition.getRecordSize().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.RECORD;
        } else if (size.getWidth() * size.getHeight() <= fetchMaxSize.getWidth() * fetchMaxSize.getHeight()) {
            configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        }
        return SurfaceConfig.create(configType, configSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<UseCaseConfig<?>, Size> getSuggestedResolutions(List<SurfaceConfig> list, List<UseCaseConfig<?>> list2) {
        HashMap hashMap;
        refreshPreviewSize();
        ArrayList arrayList = new ArrayList(list);
        for (UseCaseConfig<?> useCaseConfig : list2) {
            arrayList.add(transformSurfaceConfig(useCaseConfig.getInputFormat(), new Size(640, 480)));
        }
        if (!checkSupported(arrayList)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
        }
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(list2);
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : useCasesPriorityOrder) {
            arrayList2.add(getSupportedOutputSizes(list2.get(num.intValue())));
        }
        Iterator<List<Size>> it = getAllPossibleSizeArrangements(arrayList2).iterator();
        while (true) {
            if (!it.hasNext()) {
                hashMap = null;
                break;
            }
            List<Size> next = it.next();
            ArrayList arrayList3 = new ArrayList(list);
            for (int i = 0; i < next.size(); i++) {
                arrayList3.add(transformSurfaceConfig(list2.get(useCasesPriorityOrder.get(i).intValue()).getInputFormat(), next.get(i)));
            }
            if (checkSupported(arrayList3)) {
                hashMap = new HashMap();
                for (UseCaseConfig<?> useCaseConfig2 : list2) {
                    hashMap.put(useCaseConfig2, next.get(useCasesPriorityOrder.indexOf(Integer.valueOf(list2.indexOf(useCaseConfig2)))));
                }
            }
        }
        if (hashMap != null) {
            return hashMap;
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
    }

    private Rational getTargetAspectRatio(ImageOutputConfig imageOutputConfig) {
        Rational rational;
        int i = new TargetAspectRatio().get(this.mCameraId, this.mCharacteristics);
        if (i == 0) {
            rational = this.mIsSensorLandscapeResolution ? ASPECT_RATIO_4_3 : ASPECT_RATIO_3_4;
        } else if (i == 1) {
            rational = this.mIsSensorLandscapeResolution ? ASPECT_RATIO_16_9 : ASPECT_RATIO_9_16;
        } else if (i == 2) {
            Size fetchMaxSize = fetchMaxSize(256);
            return new Rational(fetchMaxSize.getWidth(), fetchMaxSize.getHeight());
        } else if (i != 3) {
            return null;
        } else {
            Size targetSize = getTargetSize(imageOutputConfig);
            if (!imageOutputConfig.hasTargetAspectRatio()) {
                if (targetSize != null) {
                    return new Rational(targetSize.getWidth(), targetSize.getHeight());
                }
                return null;
            }
            int targetAspectRatio = imageOutputConfig.getTargetAspectRatio();
            if (targetAspectRatio == 0) {
                rational = this.mIsSensorLandscapeResolution ? ASPECT_RATIO_4_3 : ASPECT_RATIO_3_4;
            } else if (targetAspectRatio == 1) {
                rational = this.mIsSensorLandscapeResolution ? ASPECT_RATIO_16_9 : ASPECT_RATIO_9_16;
            } else {
                Logger.e(TAG, "Undefined target aspect ratio: " + targetAspectRatio);
                return null;
            }
        }
        return rational;
    }

    SurfaceSizeDefinition getSurfaceSizeDefinition() {
        return this.mSurfaceSizeDefinition;
    }

    private Size fetchMaxSize(int i) {
        Size size = this.mMaxSizeCache.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(i);
        this.mMaxSizeCache.put(Integer.valueOf(i), maxOutputSizeByFormat);
        return maxOutputSizeByFormat;
    }

    private List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList();
        for (UseCaseConfig<?> useCaseConfig : list) {
            int surfaceOccupancyPriority = useCaseConfig.getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer num : arrayList2) {
            int intValue = num.intValue();
            for (UseCaseConfig<?> useCaseConfig2 : list) {
                if (intValue == useCaseConfig2.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig2)));
                }
            }
        }
        return arrayList;
    }

    List<Size> getSupportedOutputSizes(UseCaseConfig<?> useCaseConfig) {
        int inputFormat = useCaseConfig.getInputFormat();
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        Size[] customizedSupportSizesFromConfig = getCustomizedSupportSizesFromConfig(inputFormat, imageOutputConfig);
        if (customizedSupportSizesFromConfig == null) {
            customizedSupportSizesFromConfig = getAllOutputSizesByFormat(inputFormat);
        }
        ArrayList arrayList = new ArrayList();
        Size maxResolution = imageOutputConfig.getMaxResolution(null);
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(inputFormat);
        if (maxResolution == null || getArea(maxOutputSizeByFormat) < getArea(maxResolution)) {
            maxResolution = maxOutputSizeByFormat;
        }
        Arrays.sort(customizedSupportSizesFromConfig, new CompareSizesByArea(true));
        Size targetSize = getTargetSize(imageOutputConfig);
        Size size = DEFAULT_SIZE;
        int area = getArea(size);
        if (getArea(maxResolution) < area) {
            size = ZERO_SIZE;
        } else if (targetSize != null && getArea(targetSize) < area) {
            size = targetSize;
        }
        for (Size size2 : customizedSupportSizesFromConfig) {
            if (getArea(size2) <= getArea(maxResolution) && getArea(size2) >= getArea(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + inputFormat);
        }
        Rational targetAspectRatio = getTargetAspectRatio(imageOutputConfig);
        if (targetSize == null) {
            targetSize = imageOutputConfig.getDefaultResolution(null);
        }
        List<Size> arrayList2 = new ArrayList<>();
        new HashMap();
        if (targetAspectRatio == null) {
            arrayList2.addAll(arrayList);
            if (targetSize != null) {
                removeSupportedSizesByTargetSize(arrayList2, targetSize);
            }
        } else {
            Map<Rational, List<Size>> groupSizesByAspectRatio = groupSizesByAspectRatio(arrayList);
            if (targetSize != null) {
                for (Rational rational : groupSizesByAspectRatio.keySet()) {
                    removeSupportedSizesByTargetSize(groupSizesByAspectRatio.get(rational), targetSize);
                }
            }
            ArrayList<Rational> arrayList3 = new ArrayList(groupSizesByAspectRatio.keySet());
            Collections.sort(arrayList3, new CompareAspectRatiosByDistanceToTargetRatio(targetAspectRatio));
            for (Rational rational2 : arrayList3) {
                for (Size size3 : groupSizesByAspectRatio.get(rational2)) {
                    if (!arrayList2.contains(size3)) {
                        arrayList2.add(size3);
                    }
                }
            }
        }
        return this.mResolutionCorrector.insertOrPrioritize(getConfigType(useCaseConfig.getInputFormat()), arrayList2);
    }

    private SurfaceConfig.ConfigType getConfigType(int i) {
        if (i == 35) {
            return SurfaceConfig.ConfigType.YUV;
        }
        if (i == 256) {
            return SurfaceConfig.ConfigType.JPEG;
        }
        if (i == 32) {
            return SurfaceConfig.ConfigType.RAW;
        }
        return SurfaceConfig.ConfigType.PRIV;
    }

    private Size getTargetSize(ImageOutputConfig imageOutputConfig) {
        return flipSizeByRotation(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0));
    }

    private Size flipSizeByRotation(Size size, int i) {
        return (size == null || !isRotationNeeded(i)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private boolean isRotationNeeded(int i) {
        Integer num = (Integer) this.mCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Preconditions.checkNotNull(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int surfaceRotationToDegrees = CameraOrientationUtil.surfaceRotationToDegrees(i);
        Integer num2 = (Integer) this.mCharacteristics.get(CameraCharacteristics.LENS_FACING);
        Preconditions.checkNotNull(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(surfaceRotationToDegrees, num.intValue(), 1 == num2.intValue());
        return relativeImageRotation == 90 || relativeImageRotation == 270;
    }

    private boolean isSensorLandscapeResolution() {
        Size size = (Size) this.mCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    static boolean hasMatchingAspectRatio(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (getArea(size) >= getArea(DEFAULT_SIZE)) {
            return isPossibleMod16FromAspectRatio(size, rational);
        }
        return false;
    }

    private static boolean isPossibleMod16FromAspectRatio(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return ratioIntersectsMod16Segment(Math.max(0, height + (-16)), width, rational) || ratioIntersectsMod16Segment(Math.max(0, width + (-16)), height, rational2);
        } else if (i == 0) {
            return ratioIntersectsMod16Segment(height, width, rational);
        } else {
            if (height % 16 == 0) {
                return ratioIntersectsMod16Segment(width, height, rational2);
            }
            return false;
        }
    }

    private static int getArea(Size size) {
        return size.getWidth() * size.getHeight();
    }

    private static boolean ratioIntersectsMod16Segment(int i, int i2, Rational rational) {
        Preconditions.checkArgument(i2 % 16 == 0);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    private Map<Rational, List<Size>> groupSizesByAspectRatio(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(ASPECT_RATIO_4_3, new ArrayList());
        hashMap.put(ASPECT_RATIO_16_9, new ArrayList());
        for (Size size : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (hasMatchingAspectRatio(size, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(size)) {
                        list2.add(size);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(size.getWidth(), size.getHeight()), new ArrayList(Collections.singleton(size)));
            }
        }
        return hashMap;
    }

    private void removeSupportedSizesByTargetSize(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i >= list.size()) {
                break;
            }
            Size size2 = list.get(i);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i4 >= 0) {
                arrayList.add(list.get(i4));
            }
            i2 = i + 1;
        }
        list.removeAll(arrayList);
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        int i = 1;
        for (List<Size> list2 : list) {
            i *= list2.size();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ArrayList());
        }
        int size = i / list.get(0).size();
        int i3 = i;
        for (int i4 = 0; i4 < list.size(); i4++) {
            List<Size> list3 = list.get(i4);
            for (int i5 = 0; i5 < i; i5++) {
                ((List) arrayList.get(i5)).add(list3.get((i5 % i3) / size));
            }
            if (i4 < list.size() - 1) {
                i3 = size;
                size /= list.get(i4 + 1).size();
            }
        }
        return arrayList;
    }

    private Size[] excludeProblematicSizes(Size[] sizeArr, int i) {
        List<Size> fetchExcludedSizes = fetchExcludedSizes(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(fetchExcludedSizes);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    private Size[] getCustomizedSupportSizesFromConfig(int i, ImageOutputConfig imageOutputConfig) {
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> supportedResolutions = imageOutputConfig.getSupportedResolutions(null);
        if (supportedResolutions != null) {
            Iterator<Pair<Integer, Size[]>> it = supportedResolutions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<Integer, Size[]> next = it.next();
                if (((Integer) next.first).intValue() == i) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            Size[] excludeProblematicSizes = excludeProblematicSizes(sizeArr, i);
            Arrays.sort(excludeProblematicSizes, new CompareSizesByArea(true));
            return excludeProblematicSizes;
        }
        return sizeArr;
    }

    private Size[] getAllOutputSizesByFormat(int i) {
        Size[] sizeArr = this.mOutputSizesCache.get(Integer.valueOf(i));
        if (sizeArr == null) {
            Size[] doGetAllOutputSizesByFormat = doGetAllOutputSizesByFormat(i);
            this.mOutputSizesCache.put(Integer.valueOf(i), doGetAllOutputSizesByFormat);
            return doGetAllOutputSizesByFormat;
        }
        return sizeArr;
    }

    private Size[] doGetAllOutputSizesByFormat(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null) {
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        Size[] excludeProblematicSizes = excludeProblematicSizes(outputSizes, i);
        Arrays.sort(excludeProblematicSizes, new CompareSizesByArea(true));
        return excludeProblematicSizes;
    }

    Size getMaxOutputSizeByFormat(int i) {
        return (Size) Collections.max(Arrays.asList(getAllOutputSizesByFormat(i)), new CompareSizesByArea());
    }

    List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination3);
        return arrayList;
    }

    List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.ANALYSIS));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(getLegacySupportedCombinationList());
        int i = this.mHardwareLevel;
        if (i == 0 || i == 1 || i == 3) {
            this.mSurfaceCombinations.addAll(getLimitedSupportedCombinationList());
        }
        int i2 = this.mHardwareLevel;
        if (i2 == 1 || i2 == 3) {
            this.mSurfaceCombinations.addAll(getFullSupportedCombinationList());
        }
        int[] iArr = (int[]) this.mCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.mIsRawSupported = true;
                } else if (i3 == 6) {
                    this.mIsBurstCaptureSupported = true;
                }
            }
        }
        if (this.mIsRawSupported) {
            this.mSurfaceCombinations.addAll(getRAWSupportedCombinationList());
        }
        if (this.mIsBurstCaptureSupported && this.mHardwareLevel == 0) {
            this.mSurfaceCombinations.addAll(getBurstSupportedCombinationList());
        }
        if (this.mHardwareLevel == 3) {
            this.mSurfaceCombinations.addAll(getLevel3SupportedCombinationList());
        }
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId, this.mHardwareLevel));
    }

    private void generateSurfaceSizeDefinition() {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(new Size(640, 480), this.mDisplayInfoManager.getPreviewSize(), getRecordSize());
    }

    private void refreshPreviewSize() {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
            return;
        }
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getRecordSize());
    }

    private Size getRecordSize() {
        try {
            int parseInt = Integer.parseInt(this.mCameraId);
            CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(parseInt, 1) ? this.mCamcorderProfileHelper.get(parseInt, 1) : null;
            if (camcorderProfile != null) {
                return new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            return getRecordSizeByHasProfile(parseInt);
        } catch (NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    private Size getRecordSizeFromStreamConfigurationMap() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return QUALITY_480P_SIZE;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = QUALITY_1080P_SIZE;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return QUALITY_480P_SIZE;
    }

    private Size getRecordSizeByHasProfile(int i) {
        CamcorderProfile camcorderProfile;
        Size size = QUALITY_480P_SIZE;
        if (this.mCamcorderProfileHelper.hasProfile(i, 10)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 10);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 8)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 8);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 12)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 12);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 6)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 6);
        } else if (this.mCamcorderProfileHelper.hasProfile(i, 5)) {
            camcorderProfile = this.mCamcorderProfileHelper.get(i, 5);
        } else {
            camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i, 4) ? this.mCamcorderProfileHelper.get(i, 4) : null;
        }
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    private List<Size> fetchExcludedSizes(int i) {
        List<Size> list = this.mExcludedSizeListCache.get(Integer.valueOf(i));
        if (list == null) {
            List<Size> list2 = this.mExcludedSupportedSizesContainer.get(i);
            this.mExcludedSizeListCache.put(Integer.valueOf(i), list2);
            return list2;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class CompareAspectRatiosByDistanceToTargetRatio implements Comparator<Rational> {
        private Rational mTargetRatio;

        CompareAspectRatiosByDistanceToTargetRatio(Rational rational) {
            this.mTargetRatio = rational;
        }

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.mTargetRatio.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.mTargetRatio.floatValue())).floatValue());
        }
    }
}
