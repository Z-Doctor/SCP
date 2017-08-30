package railing_corner;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * railing_side_1 - X_Justaguy_X
 * Created using Tabula 5.1.0
 */
public class railing_corner extends ModelBase {
    public ModelRenderer railing_top;
    public ModelRenderer railing_top_2;
    public ModelRenderer railing_b;
    public ModelRenderer railing_a;
    public ModelRenderer railing_e;
    public ModelRenderer railing_d;
    public ModelRenderer railing_c;
    public ModelRenderer railing_f;
    public ModelRenderer railing_bottom;
    public ModelRenderer railing_b_2;
    public ModelRenderer railing_a_2;
    public ModelRenderer railing_e_2;
    public ModelRenderer railing_d_2;
    public ModelRenderer railing_c_2;
    public ModelRenderer railing_f_2;
    public ModelRenderer railing_bottom_2;

    public railing_corner() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.railing_d_2 = new ModelRenderer(this, 0, 0);
        this.railing_d_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_d_2.addBox(1.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_top_2 = new ModelRenderer(this, 5, 0);
        this.railing_top_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_top_2.addBox(-8.0F, 8.0F, -8.5F, 16, 1, 2, 0.0F);
        this.railing_bottom_2 = new ModelRenderer(this, 5, 0);
        this.railing_bottom_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_bottom_2.addBox(-8.0F, 23.0F, -8.5F, 16, 1, 2, 0.0F);
        this.railing_top = new ModelRenderer(this, 5, 0);
        this.railing_top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_top.addBox(-8.0F, 8.01F, -8.5F, 16, 1, 2, 0.0F);
        this.setRotateAngle(railing_top, 0.0F, 1.5707963267948966F, 0.0F);
        this.railing_e = new ModelRenderer(this, 0, 0);
        this.railing_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_e.addBox(4.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_f = new ModelRenderer(this, 0, 0);
        this.railing_f.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_f.addBox(7.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_e_2 = new ModelRenderer(this, 0, 0);
        this.railing_e_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_e_2.addBox(4.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_c_2 = new ModelRenderer(this, 0, 0);
        this.railing_c_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_c_2.addBox(-2.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_b = new ModelRenderer(this, 0, 0);
        this.railing_b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_b.addBox(-5.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_a_2 = new ModelRenderer(this, 0, 0);
        this.railing_a_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_a_2.addBox(-7.99F, 9.0F, -8.01F, 1, 14, 1, 0.0F);
        this.railing_f_2 = new ModelRenderer(this, 0, 0);
        this.railing_f_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_f_2.addBox(7.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_a = new ModelRenderer(this, 0, 0);
        this.railing_a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_a.addBox(-8.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_b_2 = new ModelRenderer(this, 0, 0);
        this.railing_b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_b_2.addBox(-5.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_d = new ModelRenderer(this, 0, 0);
        this.railing_d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_d.addBox(1.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_bottom = new ModelRenderer(this, 5, 0);
        this.railing_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_bottom.addBox(-8.0F, 23.01F, -8.5F, 16, 1, 2, 0.0F);
        this.railing_c = new ModelRenderer(this, 0, 0);
        this.railing_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.railing_c.addBox(-2.0F, 9.0F, -8.0F, 1, 14, 1, 0.0F);
        this.railing_top_2.addChild(this.railing_d_2);
        this.railing_top_2.addChild(this.railing_bottom_2);
        this.railing_top.addChild(this.railing_e);
        this.railing_top.addChild(this.railing_f);
        this.railing_top_2.addChild(this.railing_e_2);
        this.railing_top_2.addChild(this.railing_c_2);
        this.railing_top.addChild(this.railing_b);
        this.railing_top_2.addChild(this.railing_a_2);
        this.railing_top_2.addChild(this.railing_f_2);
        this.railing_top.addChild(this.railing_a);
        this.railing_top_2.addChild(this.railing_b_2);
        this.railing_top.addChild(this.railing_d);
        this.railing_top.addChild(this.railing_bottom);
        this.railing_top.addChild(this.railing_c);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.railing_top_2.render(f5);
        this.railing_top.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
