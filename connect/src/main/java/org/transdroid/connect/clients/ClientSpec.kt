package org.transdroid.connect.clients

interface ClientSpec :
        Feature.Version,
        Feature.Listing,
        Feature.StartingStopping,
        Feature.ResumingPausing,
        Feature.ForceStarting,
        Feature.AddByFile,
        Feature.AddByUrl,
        Feature.AddByMagnet
