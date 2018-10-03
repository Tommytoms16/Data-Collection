//
//  ViewController.swift
//  Collect
//
//  Created by Tommy Medaiyese on 5/19/18.
//  Copyright © 2018 Tommy Medaiyese. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var valueA: UITextField!
    @IBOutlet weak var valueB: UITextField!
    @IBOutlet weak var valueC: UITextField!
    @IBOutlet weak var valueD: UITextField!
    @IBOutlet weak var valueE: UITextField!
    @IBOutlet weak var valueF: UITextField!
    @IBOutlet weak var valueG: UITextField!
    @IBOutlet weak var valueH: UITextField!
    @IBOutlet weak var valueI: UITextField!
    @IBOutlet weak var result1: UILabel!
    @IBOutlet weak var result2: UILabel!
    @IBOutlet weak var result3: UILabel!
    @IBOutlet weak var result4: UILabel!
    @IBOutlet weak var result5: UILabel!
    @IBOutlet weak var result6: UILabel!
    @IBOutlet weak var result7: UILabel!
    @IBOutlet weak var result8: UILabel!
    @IBOutlet weak var result9: UILabel!
    @IBOutlet weak var result10: UILabel!
    
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    @IBAction func calculate(_ sender: Any) {
    
    
        
        let a = valueA.text
        let b = valueB.text
        let c = valueC.text
        let d = valueD.text
        let e = valueE.text
        let f = valueF.text
        let g = valueG.text
        let h = valueH.text
        let i = valueI.text
        
        let total = 9.0
        
        let myInt1 = Double(a!)
        let myInt2 = Double(b!)
        let myInt3 = Double(c!)
        let myInt4 = Double(d!)
        let myInt5 = Double(e!)
        let myInt6 = Double(f!)
        let myInt7 = Double(g!)
        let myInt8 = Double(h!)
        let myInt9 = Double(i!)
        
        let sum = (myInt1! + myInt2! + myInt3! + myInt4! + myInt5! + myInt6! + myInt7! + myInt8! + myInt9!)
        result1.text = "Sum:\(sum)"
        
        let average = (myInt1! + myInt2! + myInt3! + myInt4! + myInt5! + myInt6! + myInt7! + myInt8! + myInt9!) / total
        result2.text = "Average:\(average)"
        
        let power1 = pow(myInt1! - average,2.0)
        let power2 = pow(myInt2! - average,2.0)
        let power3 = pow(myInt3! - average,2.0)
        let power4 = pow(myInt4! - average,2.0)
        let power5 = pow(myInt5! - average,2.0)
        let power6 = pow(myInt6! - average,2.0)
        let power7 = pow(myInt7! - average,2.0)
        let power8 = pow(myInt8! - average,2.0)
        let power9 = pow(myInt9! - average,2.0)
        let powerTotal = power1 + power2 + power3 + power4 + power5 + power6 + power7 + power8 + power9
        
        
        
        let standardDeviation = sqrt(powerTotal / (total - 1))
        result3.text = "SD:\(standardDeviation)"
        
        let variance = pow(standardDeviation,2.0)
        result4.text = "Var:\(variance)"
        
        let minVal = min(myInt1!, myInt2!, myInt3!,myInt4!, myInt5!, myInt6!, myInt7!, myInt8!, myInt9!)
        result5.text = "Min:\(minVal)"
        
        let maxVal = max(myInt1!, myInt2!, myInt3!,myInt4!, myInt5!, myInt6!, myInt7!, myInt8!, myInt9!)
        result6.text = "Max:\(maxVal)"
        
        let range = maxVal - minVal
        result7.text = "Range:\(range)"
        
        let low = round(average - 1.96 * (standardDeviation / sqrt(total)))
        let high = round(average + 1.96 * (standardDeviation / sqrt(total)))
        result8.text = ("CI:\(low,high)")
        
        let array = [myInt1!, myInt2!, myInt3!,myInt4!, myInt5!, myInt6!, myInt7!, myInt8!, myInt9!]
        let myAscending = array.sorted()
        result9.text = "Ascend:\(myAscending)"
        
        let myDescending = array.sorted
        {
            
            (myInt1, myInt2) -> Bool in
            return myInt1 > myInt2
            
        }
        result10.text = ("Descend\(myDescending)")
    }
    
}
