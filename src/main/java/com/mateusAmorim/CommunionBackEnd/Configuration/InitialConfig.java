//package com.mateusAmorim.CommunionBackEnd.Configuration;
//
//import com.mateusAmorim.CommunionBackEnd.models.*;
//import com.mateusAmorim.CommunionBackEnd.repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class InitialConfig implements CommandLineRunner{
//
//   @Autowired
//    private CustomerAddressRepository customerAddressRepository;
//   @Autowired
//   private BankListRepository bankListRepository;
//   @Autowired
//   private ProductRepository productRepository;
//   @Autowired
//   private CategoryRepository categoryRepository;
//
//   @Autowired
//   private CustomerBankDetailsRepository customerBankDetailsRepository;
//
//   @Override
//    public void run(String... args) throws Exception {
//       CustomerAddressModel addressOne = new CustomerAddressModel(16, 14);
//       CustomerAddressModel addressTwo = new CustomerAddressModel(14, 16);
//
//       customerAddressRepository.saveAll(
//               List.of(addressOne, addressTwo)
//       );
//
//      BankListModel itau = new BankListModel("Itau",341);
//      BankListModel bradesco = new BankListModel("Bradesco", 237);
//      BankListModel nubank = new BankListModel("Nubank", 260);
//      BankListModel santander = new BankListModel("Santander", 33);
//      BankListModel bancoDoBrasil = new BankListModel("Banco do Brasil", 1);
//
//      bankListRepository.saveAll(List.of(
//              itau,
//              bradesco,
//              nubank,
//              santander,
//              bancoDoBrasil)
//      );
//
//       CategoryModel eletrodomesticos = new CategoryModel();
//
////      ProductModel televisao = new ProductModel(
////              "televisão",
////              "Eletrodomestico para assistir a filmes e séries",
////              true,
////              100.00
////      );
////
////       ProductModel videogame = new ProductModel(
////               "videogame",
////               "Eletrodomestico para jogar e assistir filmes e séries",
////               true,
////               150.78
////       );
////
////       productRepository.saveAll(
////               List.of(televisao, videogame)
////       );
//
////       eletrodomesticos = new CategoryModel(
////               "Eletrodoméstico",
////               List.of(
////                       videogame,
////                       televisao
////               ));
//
//
////       CategoryModel ferramentas = new CategoryModel(
////               "Ferramentas",
////               List.of(
////                       videogame,
////                       televisao
////               ));
////
////       categoryRepository.saveAll(
////               List.of(ferramentas)
////       );
//
//       CustomerBankDetailsModel contaItau = new CustomerBankDetailsModel(
//               true,
//               1234,
//               12345678,
//               itau
//       );
//
//       CustomerBankDetailsModel contaBradesco = new CustomerBankDetailsModel(
//               true,
//               4321,
//               8765431,
//               bradesco
//       );
//
//       customerBankDetailsRepository.saveAll(
//               List.of(contaItau, contaBradesco)
//       );
//
//   }
//}
