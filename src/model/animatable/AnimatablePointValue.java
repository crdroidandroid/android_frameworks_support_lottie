package frameworks.support.lottie.model.animatable;

import android.graphics.PointF;

import frameworks.support.lottie.value.Keyframe;
import frameworks.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import frameworks.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
