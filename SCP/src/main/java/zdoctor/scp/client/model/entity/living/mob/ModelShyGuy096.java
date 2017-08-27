package zdoctor.scp.client.model.entity.living.mob;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import zdoctor.scp.entity.living.EntityShyGuy096;

public class ModelShyGuy096 extends ModelBase {

    protected ModelShyGuy096Angry angryModel;
    protected ModelShyGuy096Idle idelModel;

	public ModelShyGuy096() {
    	angryModel = new ModelShyGuy096Angry();
    	idelModel = new ModelShyGuy096Idle();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if(((EntityShyGuy096) entity).isScreaming()) {
    		GlStateManager.scale(0.6, 0.7, 0.6);
    		GlStateManager.translate(0, 0.62, 0);
//    		GlStateManager.scale(0.1, 0.1, 0.1);
    		angryModel.render(entity, f, f1, f2, f3, f4, f5);
    	} else {
    		GlStateManager.scale(0.6, 0.7, 0.6);
    		GlStateManager.translate(0, 0.62, 0);
    		idelModel.render(entity, f, f1, f2, f3, f4, f5);
    	}
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
