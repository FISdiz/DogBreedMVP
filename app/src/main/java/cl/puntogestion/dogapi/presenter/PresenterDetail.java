package cl.puntogestion.dogapi.presenter;

import android.util.Log;

import java.util.List;

import cl.puntogestion.dogapi.model.IModel;

public class PresenterDetail implements IPresenterDetail, IPresenterModel  {

    IPresenterViewImages iPresenterViewImages;
    IModel imodel;

    public PresenterDetail(IPresenterViewImages presenter) {
        this.iPresenterViewImages = presenter;
    }

    public void setImodel(IModel imodel) {
        this.imodel = imodel;
    }

    @Override
    public void loadBreedImages(String breed) {
        imodel.loadImages(breed, breed);
    }

    @Override
    public void loadSubBreedImages(String breed, String subBreed) {

    }

    @Override
    public void notificar(List<String> urls) {
        iPresenterViewImages.notificar(urls);
    }

    public interface IPresenterViewImages {
        void notificar(List<String> lista);
    }
}