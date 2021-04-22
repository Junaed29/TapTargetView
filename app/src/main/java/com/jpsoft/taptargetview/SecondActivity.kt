package com.jpsoft.taptargetview

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetSequence
import com.jpsoft.taptargetview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        TapTargetSequence(this)
            .targets(
                TapTarget.forView(
                    binding.button1,
                    "This is selling Button",
                    "This will handle selling"
                )
                    .outerCircleColor(R.color.purple_500)
                    .outerCircleAlpha(0.96f)
                    .targetCircleColor(R.color.white)
                    .titleTextSize(18)
                    .titleTextColor(R.color.white)
                    .descriptionTextSize(14)
                    .descriptionTextColor(R.color.white)
                    .textTypeface(Typeface.SANS_SERIF)
                    .dimColor(R.color.black)
                    .drawShadow(true)
                    .cancelable(false)
                    .tintTarget(true)
                    .transparentTarget(true)
                    .targetRadius(55),

                TapTarget.forView(
                    binding.button2,
                    "This is buying Button",
                    "This will handle all buying"
                )
                    .outerCircleColor(R.color.purple_200)
                    .outerCircleAlpha(0.96f)
                    .targetCircleColor(R.color.white)
                    .titleTextSize(18)
                    .titleTextColor(R.color.white)
                    .descriptionTextSize(14)
                    .descriptionTextColor(R.color.black)
                    .textColor(R.color.black)
                    .textTypeface(Typeface.SANS_SERIF)
                    .dimColor(R.color.black)
                    .drawShadow(true)
                    .cancelable(false)
                    .tintTarget(true)
                    .transparentTarget(true)
                    .targetRadius(55),

                TapTarget.forView(
                    binding.button3,
                    "This is renting Button",
                    "This will handle all rents"
                )
                    .outerCircleColor(R.color.purple_700)
                    .outerCircleAlpha(0.96f)
                    .targetCircleColor(R.color.white)
                    .titleTextSize(18)
                    .descriptionTextSize(14)
                    .textColor(R.color.white)
                    .textTypeface(Typeface.SANS_SERIF)
                    .dimColor(R.color.black)
                    .drawShadow(true)
                    .cancelable(false)
                    .tintTarget(true)
                    .transparentTarget(true)
                    .targetRadius(55),

                TapTarget.forView(
                    binding.button4,
                    "This is a guide Button",
                    "This will help you to control all things"
                )
                    .outerCircleColor(R.color.purple_200)
                    .outerCircleAlpha(0.96f)
                    .titleTextSize(18)
                    .descriptionTextSize(14)
                    .descriptionTextColor(R.color.black)
                    .textColor(R.color.black)
                    .textTypeface(Typeface.SANS_SERIF)
                    .dimColor(R.color.black)
                    .drawShadow(true)
                    .cancelable(false)
                    .tintTarget(true)
                    .transparentTarget(true)
                    .targetRadius(55),

                TapTarget.forView(
                    binding.floatingActionButton,
                    "This is a Floating Action Button",
                    "This will handle the bookmark"
                )
                    .outerCircleColor(R.color.red)
                    .outerCircleAlpha(0.96f)
                    .targetCircleColor(R.color.white)
                    .titleTextSize(18)
                    .titleTextColor(R.color.white)
                    .descriptionTextSize(14)
                    .descriptionTextColor(R.color.black)
                    .textColor(R.color.black)
                    .textTypeface(Typeface.SANS_SERIF)
                    .dimColor(R.color.black)
                    .drawShadow(true)
                    .cancelable(false)
                    .tintTarget(true)
                    .transparentTarget(true)
                    .targetRadius(55)
            ).listener(object : TapTargetSequence.Listener {
                override fun onSequenceFinish() {
                    Toast.makeText(this@SecondActivity, "Congrats, You are ready to use this app",Toast.LENGTH_LONG).show()
                }

                override fun onSequenceStep(lastTarget: TapTarget?, targetClicked: Boolean) {
                    Toast.makeText(this@SecondActivity, "Great!!",Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceCanceled(lastTarget: TapTarget?) {

                }
            }).start()
    }
}