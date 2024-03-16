package net.mrmisc.mymod.entity.projectile;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;


public class RockModel extends RockModelBase {

	private final ModelPart bb_main;

	public RockModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
	}

	public ModelPart getRoot() {
		return bb_main;
	}

	public void setupAnim(float p_103811_, float p_103812_, float p_103813_) {
		this.bb_main.yRot = p_103812_ * ((float)Math.PI / 180F);
		this.bb_main.xRot = p_103813_ * ((float)Math.PI / 180F);
	}

	public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
		this.bb_main.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pRed, pGreen, pBlue, pAlpha);
	}

	public ModelPart root() {
		return bb_main;
	}
}
