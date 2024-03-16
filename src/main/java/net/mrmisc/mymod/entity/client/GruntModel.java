package net.mrmisc.mymod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.world.entity.Entity;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;

public class GruntModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart grunt;
	private final ModelPart head;

	public GruntModel(ModelPart root) {
		this.grunt = root.getChild("grunt");
		this.head = grunt.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition grunt = partdefinition.addOrReplaceChild("grunt", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = grunt.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(18, 29).addBox(-5.0F, -2.0F, -1.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightlowerleg_r1 = right_leg.addOrReplaceChild("rightlowerleg_r1", CubeListBuilder.create().texOffs(40, 39).addBox(-4.0F, -5.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightupperleg_r1 = right_leg.addOrReplaceChild("rightupperleg_r1", CubeListBuilder.create().texOffs(16, 36).addBox(-4.0F, -9.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg = grunt.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 29).addBox(1.0F, -2.0F, -1.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftupperleg_r1 = left_leg.addOrReplaceChild("leftupperleg_r1", CubeListBuilder.create().texOffs(24, 36).addBox(2.0F, -9.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leftlowerleg_r1 = left_leg.addOrReplaceChild("leftlowerleg_r1", CubeListBuilder.create().texOffs(32, 39).addBox(2.0F, -5.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition body = grunt.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 9).addBox(-5.0F, -10.0F, -1.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -19.0F, -2.0F, 12.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 19).addBox(-5.0F, -2.0F, -17.0F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-5.0F, -4.0F, 13.0F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition arms = grunt.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = arms.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 36).addBox(-7.0F, -13.0F, -9.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 36).addBox(5.0F, -13.0F, -9.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition head = grunt.addOrReplaceChild("head", CubeListBuilder.create().texOffs(13, 29).addBox(-1.0F, -21.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(31, 29).addBox(-3.0F, -26.0F, 1.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(31, 0).addBox(-3.0F, -26.0F, -2.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 34).addBox(-3.0F, -22.0F, -9.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 19).addBox(-3.0F, -22.0F, 8.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		grunt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return grunt;
	}
}